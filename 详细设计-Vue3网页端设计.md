# 详细设计-Vue3网页端设计

## 1. 技术栈

- Vue 3。
- TypeScript。
- Vite。
- Vue Router。
- Pinia。
- Axios。
- Element Plus。

## 2. 目录结构

```text
src
  api
    http.ts
    authApi.ts
    fileApi.ts
    taskApi.ts
    adminApi.ts
  router
    index.ts
  stores
    authStore.ts
    fileStore.ts
    taskStore.ts
  views
    LoginView.vue
    RegisterView.vue
    DriveView.vue
    ProfileView.vue
    AdminView.vue
  components
    FileToolbar.vue
    FileBreadcrumb.vue
    FileTable.vue
    UploadDialog.vue
    MoveDialog.vue
    TaskDrawer.vue
    CapacityBar.vue
```

## 3. 路由设计

| 路径 | 页面 | 权限 |
| --- | --- | --- |
| /login | LoginView | 公开 |
| /register | RegisterView | 公开 |
| /drive | DriveView | 登录 |
| /profile | ProfileView | 登录 |
| /admin | AdminView | 管理员 |

路由守卫：

- 未登录访问受保护页面时跳转 `/login`。
- 非管理员访问 `/admin` 时提示权限不足并返回 `/drive`。

## 4. API 封装

`http.ts` 负责：

- 设置 `baseURL`。
- 自动附加 `Authorization`。
- 自动附加 `X-Client-Type: web`。
- 统一处理 `code !== 0` 的错误。
- 登录过期时清理 token 并跳转登录页。

## 5. 状态管理

### 5.1 authStore

状态：

- `token`。
- `user`。
- `isLoggedIn`。

方法：

- `register`。
- `login`。
- `logout`。
- `loadProfile`。

token 存储：

- 浏览器端使用 `localStorage`。
- 退出登录时删除 token 和用户信息。

### 5.2 fileStore

状态：

- `currentParentId`。
- `breadcrumb`。
- `files`。
- `page`。
- `size`。
- `total`。
- `loading`。

方法：

- `loadFiles`。
- `enterFolder`。
- `goToParent`。
- `createFolder`。
- `uploadFile`。
- `downloadFile`。
- `renameFile`。
- `moveFile`。
- `deleteFile`。
- `searchFiles`。

### 5.3 taskStore

状态：

- `tasks`。
- `uploadProgressMap`。
- `downloadProgressMap`。

方法：

- `loadTasks`。
- `updateLocalProgress`。
- `cancelTask`。
- `retryTask`。

## 6. 页面设计

### 6.1 登录页

表单字段：

- 账号。
- 密码。

交互：

- 登录成功保存 token，跳转 `/drive`。
- 登录失败显示错误提示。

### 6.2 注册页

表单字段：

- 用户名。
- 邮箱。
- 密码。
- 确认密码。

校验：

- 用户名不能为空。
- 邮箱格式正确。
- 两次密码一致。

### 6.3 网盘首页

布局：

- 顶部区域：用户菜单、容量信息。
- 工具栏：上传、新建文件夹、搜索。
- 面包屑：显示当前路径。
- 文件表格：显示文件和文件夹。
- 任务抽屉：显示上传下载进度。

文件表格列：

- 名称。
- 类型。
- 大小。
- 更新时间。
- 操作。

操作：

- 打开文件夹。
- 下载文件。
- 重命名。
- 移动。
- 删除。

删除前必须弹出确认框。

### 6.4 用户信息页

展示：

- 用户名。
- 邮箱。
- 角色。
- 总容量。
- 已用容量。
- 账号状态。

### 6.5 管理员页

功能：

- 用户列表。
- 用户状态切换。
- 用户容量调整。
- 系统存储统计。
- 操作日志列表。

管理员页入口仅对 `role=admin` 用户展示。

## 7. 上传下载设计

### 7.1 上传

使用 `FormData`：

```ts
formData.append('parentId', parentId ?? '')
formData.append('conflictPolicy', 'auto_rename')
formData.append('file', file)
```

通过 Axios `onUploadProgress` 更新任务进度。

上传成功后刷新当前目录和用户容量。

### 7.2 下载

请求类型使用 `blob`。

流程：

1. 调用下载接口。
2. 根据响应头获取文件名。
3. 创建临时下载链接。
4. 触发浏览器下载。
5. 清理临时链接。

## 8. 错误处理

- `40001`：清理登录状态并跳转登录页。
- `40003`：提示权限不足。
- `40009`：提示文件名冲突。
- `40010`：提示容量不足。
- `50000`：提示系统繁忙。

## 9. 三端一致性要求

网页端在以下操作成功后必须刷新当前目录：

- 上传。
- 新建文件夹。
- 重命名。
- 移动。
- 删除。

同时刷新用户信息中的容量数据。
