package com.gm222.server.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.InputStream;

/**
 * 文件内容流式读取 DTO。
 *
 * DTO 是 Data Transfer Object 的缩写，表示“数据传输对象”。
 * 这个类不直接对应完整的数据表，而是专门表示一次从数据库读取文件内容的结果。
 *
 * 它把文件内容的必要元数据和 LONGBLOB 对应的 InputStream 放在一起，
 * service 层拿到这个对象后，可以根据 size、md5 等信息处理 contentStream。
 *
 * 重要：contentStream 来自 JDBC ResultSet#getBinaryStream(...)。
 * 它只在 DAO 回调执行期间有效，不能保存到成员变量、缓存或异步线程里延迟读取。
 */

@Getter
@AllArgsConstructor
public class FileContentStream {
    private final long id;          //file_contents 表的主键 id
    private final long file_id;     //files 表里的文件 id
    private final long size;        //文件内容大小
    private final String md5;       //文件内容 md5 值
    private final InputStream fileContentStream;    //service 层应该立即读取这个流 例如复制到 OutputStream 回调结束后 DAO 会关闭这个流
}
