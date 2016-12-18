package com.github.springbootdubboxdemo.api.service;

import com.github.springbootdubboxdemo.api.model.UserOrderModel;
import com.github.springbootdubboxdemo.api.req.UserOrderReq;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * 订单相关接口
 *
 * @author: lvhao
 * @since: 2016-10-13 15:52
 */
public interface OrderService {
    @NotNull List<UserOrderModel> queryUserOrders(UserOrderReq req);
}
