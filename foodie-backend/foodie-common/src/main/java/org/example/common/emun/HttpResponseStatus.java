package org.example.common.emun;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum HttpResponseStatus {

    SUCCESS(200,"成功"),
    MSG_ERROR(500,"error_msg"),
    MAP_ERROR(501,"error_map"),
    TOKEN_ERROR(502,"验证信息错误"),
    EXCEPTION_ERROR(555,"发生异常");

    public final int code;
    public final String message;
}
