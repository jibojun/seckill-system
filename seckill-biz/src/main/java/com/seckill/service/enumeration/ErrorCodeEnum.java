package com.seckill.service.enumeration;

/**
 * @Author: Bojun Ji
 * @Description:
 * @Date: 2018/9/13_1:03 AM
 */
public enum ErrorCodeEnum {
    PARAM_ERROR(-1, "input parameters are not correct");

    private int code;
    private String message;

    ErrorCodeEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
