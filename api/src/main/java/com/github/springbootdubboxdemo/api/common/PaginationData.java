package com.github.springbootdubboxdemo.api.common;

import java.io.Serializable;

/**
 * Created by root on 2016/12/24 0024.
 */
public class PaginationData<T> implements Serializable {
    private Page page;
    private T data;

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PaginationData{");
        sb.append("page=").append(page);
        sb.append(", data=").append(data);
        sb.append('}');
        return sb.toString();
    }
}
