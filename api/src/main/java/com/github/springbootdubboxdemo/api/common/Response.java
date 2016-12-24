package com.github.springbootdubboxdemo.api.common;

import java.io.Serializable;

/**
 * Created by root on 2016/12/24 0024.
 */
public class Response<T> implements Serializable {
    private RetCode retCode;
    private T data;

    public Response() {
        this.retCode = RetCodeConst.OK;
    }
    public RetCode getRetCode() {
        return retCode;
    }

    public void setRetCode(RetCode retCode) {
        this.retCode = retCode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Response{");
        sb.append("retCode=").append(retCode);
        sb.append(", data=").append(data);
        sb.append('}');
        return sb.toString();
    }
}
