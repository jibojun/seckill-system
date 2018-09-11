package com.seckill.entity.vo;

/**
 * @Author: Bojun Ji
 * @Description:
 * @Date: 2018/7/22_1:45 AM
 */
public class ReturnMsgVo<T> {
    private T response;
    private String errorMessage;
    private boolean result;

    public T getResponse() {
        return response;
    }

    public void setResponse(T response) {
        this.response = response;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }
}
