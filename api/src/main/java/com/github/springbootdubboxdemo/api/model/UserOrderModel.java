package com.github.springbootdubboxdemo.api.model;



import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Set;

/**
 * 客户订单类
 * Created by root on 2016/12/17 0017.
 */
public class UserOrderModel implements Serializable {

    @Valid
    private UserModel user;

    @NotNull
    @Valid
    private Set<OrderModel> orders;

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public Set<OrderModel> getOrders() {
        return orders;
    }

    public void setOrders(Set<OrderModel> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserOrderModel{");
        sb.append("user=").append(user);
        sb.append(", orders=").append(orders);
        sb.append('}');
        return sb.toString();
    }
}
