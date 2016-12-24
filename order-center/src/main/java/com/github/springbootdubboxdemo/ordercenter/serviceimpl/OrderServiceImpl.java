package com.github.springbootdubboxdemo.ordercenter.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.springbootdubboxdemo.api.common.Response;
import com.github.springbootdubboxdemo.api.common.ResponseBuilder;
import com.github.springbootdubboxdemo.api.model.OrderModel;
import com.github.springbootdubboxdemo.api.model.UserOrderModel;
import com.github.springbootdubboxdemo.api.req.OrderReq;
import com.github.springbootdubboxdemo.api.req.UserOrderReq;
import com.github.springbootdubboxdemo.api.service.OrderService;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * 订单接口实现
 *
 * @author: lvhao
 * @since: 2016-10-13 16:07
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public Response<List<UserOrderModel>> queryUserOrders(UserOrderReq req) {
        if (Objects.equals(req.getUserId(),1000L)) {
            UserOrderModel uoModel = new UserOrderModel();
            OrderModel orderModel = new OrderModel();
            orderModel.setId(1L);
            orderModel.setUserId(10000L);
            orderModel.setRemark("测试数据");
            return ResponseBuilder.newBuilder().data(uoModel).build();
        }
        return ResponseBuilder.newBuilder().build();
    }

    @Override
    public Response<Void> createOrder(OrderReq req) {
        return ResponseBuilder.newBuilder().build();
    }

    @Override
    public Response<Void> updateOrder(OrderReq req) {
        return ResponseBuilder.newBuilder().build();
    }
}
