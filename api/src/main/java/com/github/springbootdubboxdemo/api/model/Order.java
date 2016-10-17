package com.github.springbootdubboxdemo.api.model;

import java.io.Serializable;

/**
 * 订单实体描述
 *
 * @author: lvhao
 * @since: 2016-10-13 15:55
 */
public class Order implements Serializable{
    private long userId;
    private String orderNo;
    private String remark;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Order{");
        sb.append("orderNo='").append(orderNo).append('\'');
        sb.append(", remark='").append(remark).append('\'');
        sb.append(", userId=").append(userId);
        sb.append('}');
        return sb.toString();
    }
}
