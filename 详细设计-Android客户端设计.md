# 详细设计-Android客户端设计

## 1. 技术栈

- Kotlin。
- Android 原生开发。
- Retrofit 或 OkHttp。
- Kotlin Coroutines。
- Jetpack ViewModel。
- Jetpack DataStore。

## 2. 分层结构

```text
ui
  LoginActivity
  RegisterActivity
  MainActivity
  FileListFragment
  TaskFragment
  ProfileFragment
data
  api
  model
  repository
local
  TokenStore
  AppConfigStore
util
  FilePickerUtils
  DownloadUtils
  FormatUtils
```

## 3. 页面设计

### 3.1 登录页

字段：

- 账号。
- 密码。
- 记住登录状态。

逻辑：

- 登录成功保存 token 到 DataStore。
- 跳转文件首页。
- 登录失败展示错误提示。

### 3.2 文件首页

区域：

- 当前路径。
- 文件和文件夹列表。
- 上传按钮。
- 搜索入口。
- 容量信息。
- 用户菜单。

操作：

- 点击文件夹进入目录。
- 点击文件下载。
- 长按条目弹出操作菜单。
- 下拉刷新当前目录。

### 3.3 任务页

展示：

- 上传任务列表。
- 下载任务列表。
- 状态。
- 进度。
- 取消。
- 重试。

### 3.4 用户信息页

展示：

- 用户名。
- 邮箱。
- 总容量。
- 已用容量。
- 状态。

## 4. 网络层设计

所有请求附加：

```text
Authorization: Bearer <jwt>
X-Client-Type: android
```

Retrofit 接口：

```kotlin
interface ApiService {
    suspend fun login(request: LoginRequest): ApiResponse<LoginResult>
    suspend fun getFiles(parentId: Long?, page: Int, size: Int): ApiResponse<PageResult<FileItem>>
    suspend fun uploadFile(parentId: Long?, part: MultipartBody.Part): ApiResponse<UploadResult>
    suspend fun downloadFile(id: Long): Response<ResponseBody>
}
```

拦截器职责：

- 添加 token。
- 添加客户端类型。
- 处理 401 或业务码 40001。
- 记录网络错误。

## 5. 本地凭证设计

使用 DataStore 保存：

- token。
- serverBaseUrl。
- 最近登录用户。

要求：

- 不保存明文密码。
- 退出登录时清理 token。
- token 为空时进入登录页。

## 6. 文件上传设计

上传来源：

- Android 系统文件选择器。

流程：

1. 用户选择本地文件。
2. 通过 ContentResolver 获取输入流和文件名。
3. 构造 multipart 请求体。
4. 调用上传接口。
5. 在任务页展示进度。
6. 上传成功后刷新当前目录和容量。

注意：

- 需要处理 Android URI 权限。
- 不应假设文件一定有真实本地路径。
- 大文件上传应使用流式 RequestBody。

## 7. 文件下载设计

流程：

1. 用户点击文件。
2. 调用下载接口。
3. 使用响应流写入应用下载目录或用户可访问目录。
4. 更新任务进度。
5. 下载完成后通知用户。

本地文件名冲突：

- 默认自动追加 `(1)`。

## 8. 权限设计

根据 Android 版本处理文件访问权限：

- Android 8.0 及以上支持。
- 优先使用系统文件选择器和应用私有目录。
- 如保存到公共目录，需要按系统版本申请对应权限。

## 9. ViewModel 设计

### 9.1 AuthViewModel

方法：

- `login`。
- `logout`。
- `loadProfile`。

### 9.2 FileViewModel

方法：

- `loadFiles`。
- `enterFolder`。
- `createFolder`。
- `upload`。
- `download`。
- `rename`。
- `move`。
- `delete`。
- `search`。

### 9.3 TaskViewModel

方法：

- `loadTasks`。
- `cancelTask`。
- `retryTask`。
- `updateProgress`。

## 10. 异常处理

| 场景 | 处理 |
| --- | --- |
| 网络不可用 | Toast 或页面提示，可重试 |
| token 过期 | 清理 token，跳转登录页 |
| 容量不足 | 弹窗提示 |
| 权限不足 | 提示并刷新当前目录 |
| 上传失败 | 任务状态 failed |
| 下载失败 | 删除未完成文件，允许重试 |

## 11. 三端一致性

Android 客户端在以下场景刷新当前目录：

- 上传成功。
- 新建文件夹成功。
- 重命名成功。
- 移动成功。
- 删除成功。

容量信息在上传和删除成功后刷新。
