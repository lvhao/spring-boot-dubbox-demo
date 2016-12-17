package com.github.springbootdubboxdemo.api.req;

import java.io.Serializable;
import java.util.Set;

/**
 * Created by root on 2016/12/17 0017.
 */
public class UserOrderReq implements Serializable {
    private Long userId;
    private String mobile;
    private Set<Long> orderIds;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Set<Long> getOrderIds() {
        return orderIds;
    }

    public void setOrderIds(Set<Long> orderIds) {
        this.orderIds = orderIds;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserOrderReq{");
        sb.append("userId=").append(userId);
        sb.append(", orderIds=").append(orderIds);
        sb.append(", mobile='").append(mobile).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
