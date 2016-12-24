package com.github.springbootdubboxdemo.api.req;

import com.github.springbootdubboxdemo.api.validator.Update;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by root on 2016/12/24 0024.
 */
public class OrderReq implements Serializable {

    @NotNull(groups = {Update.class})
    @Min(value = 1, groups = {Update.class})
    private Long orderId;

    @NotNull
    @Min(1)
    private Long userId;

    @NotNull
    @Length(min = 11, max = 11)
    private String userMobile;

    @NotNull
    @Min(1)
    private Long productId;

    @NotEmpty
    @NotBlank
    @Length(min = 1,max = 20)
    private String remark;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("OrderReq{");
        sb.append("orderId=").append(orderId);
        sb.append(", userId=").append(userId);
        sb.append(", userMobile='").append(userMobile).append('\'');
        sb.append(", productId=").append(productId);
        sb.append(", remark='").append(remark).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
