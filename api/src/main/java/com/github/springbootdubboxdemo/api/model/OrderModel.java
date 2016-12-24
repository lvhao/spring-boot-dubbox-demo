package com.github.springbootdubboxdemo.api.model;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 订单实体描述
 *
 * @author: lvhao
 * @since: 2016-10-13 15:55
 */
public class OrderModel implements Serializable{

    @NotNull
    private Long id;

    @NotNull
    private Long userId;

    @NotEmpty
    @NotBlank
    @Length(max = 20)
    private String remark;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("OrderModel{");
        sb.append("id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", remark='").append(remark).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
