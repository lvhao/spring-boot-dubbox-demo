package com.github.springbootdubboxdemo.api.service;

import com.github.springbootdubboxdemo.api.common.Response;
import com.github.springbootdubboxdemo.api.model.UserOrderModel;
import com.github.springbootdubboxdemo.api.req.OrderReq;
import com.github.springbootdubboxdemo.api.req.UserOrderReq;
import com.github.springbootdubboxdemo.api.validator.Create;
import com.github.springbootdubboxdemo.api.validator.Update;
import org.springframework.validation.annotation.Validated;

import java.util.List;

/**
 * 订单相关接口
 *
 * @author: lvhao
 * @since: 2016-10-13 15:52
 */
public interface OrderService {
    Response<List<UserOrderModel>> queryUserOrders(UserOrderReq req);
    Response<Void> createOrder(@Validated({Create.class}) OrderReq req);
    Response<Void> updateOrder(@Validated({Update.class}) OrderReq req);
}
