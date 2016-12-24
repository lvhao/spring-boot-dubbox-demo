package com.github.springbootdubboxdemo.api.common;

import java.io.Serializable;

/**
 * Created by root on 2016/12/24 0024.
 */
public class Page implements Serializable {
    private Integer index;
    private Integer size;
    private Integer totalCount;

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Page{");
        sb.append("index=").append(index);
        sb.append(", size=").append(size);
        sb.append(", totalCount=").append(totalCount);
        sb.append('}');
        return sb.toString();
    }
}
