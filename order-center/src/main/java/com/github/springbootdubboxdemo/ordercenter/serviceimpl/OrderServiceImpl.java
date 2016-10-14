package com.github.springbootdubboxdemo.ordercenter.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.springbootdubboxdemo.api.model.Order;
import com.github.springbootdubboxdemo.api.service.OrderService;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 订单接口实现
 *
 * @author: lvhao
 * @since: 2016-10-13 16:07
 */
@Service(protocol = "dubbo")
public class OrderServiceImpl implements OrderService {

    @Override
    public List<Order> queryUserOrders(long userId) {
        if (userId == 1000L) {
            Order order = new Order();
            order.setUserId(10000L);
            order.setOrderNo("NO123456789");
            order.setRemark("测试数据");
            return Arrays.asList(order);
        }
        return Collections.emptyList();
    }
}
