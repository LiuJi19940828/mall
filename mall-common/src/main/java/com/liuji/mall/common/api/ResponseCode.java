package com.liuji.mall.common.api;

public enum ResponseCode {
    SUCCESS_CODE("请求成功", 200),
    FAILURE_CODE("请求失败", 500);

    private String message;
    private Integer code;

    ResponseCode(String message, Integer code) {
        this.message = message;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
