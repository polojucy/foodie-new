package com.foodie.common.result;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.foodie.common.emun.HttpResponseStatus;
import lombok.Data;

@Data
public class JSONResult {

    // 定义jackson对象
    private static final ObjectMapper MAPPER = new ObjectMapper();

    // 响应业务状态
    private Integer status;

    // 响应消息
    private String msg;

    // 响应中的数据
    private Object data;

    @JsonIgnore
    private String ok;	// 不使用

    public JSONResult(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public JSONResult(Object data) {
        this.status = HttpResponseStatus.SUCCESS.code;
        this.msg = HttpResponseStatus.SUCCESS.message;
        this.data = data;
    }

    public static JSONResult ok(Object data) {
        return new JSONResult(data);
    }

    public static JSONResult ok() {
        return new JSONResult(null);
    }

    public static JSONResult errorMsg(String msg) {
        return new JSONResult(HttpResponseStatus.MSG_ERROR.code, msg, null);
    }

    public static JSONResult errorMap(Object data) {
        return new JSONResult(HttpResponseStatus.MAP_ERROR.code, HttpResponseStatus.MAP_ERROR.message, data);
    }

    public static JSONResult errorTokenMsg(String msg) {
        return new JSONResult(HttpResponseStatus.TOKEN_ERROR.code, msg, null);
    }

    public static JSONResult errorException(String msg) {
        return new JSONResult(HttpResponseStatus.EXCEPTION_ERROR.code, msg, null);
    }

    public static JSONResult errorUserQQ(String msg) {
        return new JSONResult(HttpResponseStatus.EXCEPTION_ERROR.code, msg, null);
    }

    public Boolean isOK() {
        return this.status == HttpResponseStatus.SUCCESS.code;
    }

}
