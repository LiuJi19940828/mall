package com.liuji.mall.common.api;

public class CommonResult<T> {
    private String message;
    private Integer code;
    private T data;

    public CommonResult(String message, Integer code, T data) {
        this.message = message;
        this.code = code;
        this.data = data;
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <T> CommonResult<T> success(T data) {
        return new CommonResult<>(ResponseCode.SUCCESS_CODE.getMessage(), ResponseCode.SUCCESS_CODE.getCode(), data);
    }

    public static <T> CommonResult<T> failure(T data) {
        return new CommonResult<>(ResponseCode.FAILURE_CODE.getMessage(), ResponseCode.FAILURE_CODE.getCode(), data);
    }
}
