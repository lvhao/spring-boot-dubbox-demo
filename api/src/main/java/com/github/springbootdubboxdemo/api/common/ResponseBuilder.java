package com.github.springbootdubboxdemo.api.common;

/**
 * Created by root on 2016/12/24 0024.
 */
public class ResponseBuilder {
    private Response resp;
    public void ResponseBuilder() {
        this.resp = new Response();
    }
    public static ResponseBuilder newBuilder() {
        return new ResponseBuilder();
    }
    public ResponseBuilder withResp(Response resp) {
        this.resp = resp;
        return this;
    }

    public ResponseBuilder code(RetCode retCode) {
        this.resp.setRetCode(retCode);
        return this;
    }

    public <T> ResponseBuilder data(T data) {
        this.resp.setData(data);
        return this;
    }

    public <T> Response<T> build() {
        return this.resp;
    }
}
