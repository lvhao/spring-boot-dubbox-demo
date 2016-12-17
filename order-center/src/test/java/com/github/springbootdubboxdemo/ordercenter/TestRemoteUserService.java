package com.github.springbootdubboxdemo.ordercenter;

import com.alibaba.dubbo.config.annotation.Reference;
import com.github.springbootdubboxdemo.api.model.User;
import com.github.springbootdubboxdemo.api.service.UserService;
import org.junit.Test;

/**
 * 测试调用远端userService
 *
 * @author: lvhao
 * @since: 2016-10-13 20:44
 */
public class TestRemoteUserService extends TestBase {

    @Reference
    public UserService userService;

    @Test
    public void queryUser(){
        User user = userService.queryUser(1000L);
        System.out.println("user = " + user);
    }
}
