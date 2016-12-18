package com.github.springbootdubboxdemo.usercenter;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.rpc.RpcException;
import com.github.springbootdubboxdemo.api.req.UserOrderReq;
import com.github.springbootdubboxdemo.api.service.OrderService;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.Set;

/**
 * 调用远端orderService
 *
 * @author: lvhao
 * @since: 2016-10-13 20:40
 */
public class TestRemoteOrderService extends TestBase {

    @Reference
    private OrderService orderService;

    @Test
    public void queryUserOrders(){
        UserOrderReq userOrderReq = new UserOrderReq();
        userOrderReq.setUserId(1000L);
        userOrderReq.setMobile("138");
        try{
            orderService.queryUserOrders(userOrderReq).stream().forEach(System.out::println);
        } catch (RpcException e) {
            ConstraintViolationException ve = (ConstraintViolationException) e.getCause();
            Set<ConstraintViolation<?>> violations = ve.getConstraintViolations();
            System.out.println(violations);
        }
    }
}
