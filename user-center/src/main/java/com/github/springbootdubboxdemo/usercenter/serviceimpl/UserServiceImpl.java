package com.github.springbootdubboxdemo.usercenter.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.springbootdubboxdemo.api.model.User;
import com.github.springbootdubboxdemo.api.service.UserService;

/**
 * 用户接口实现
 *
 * @author: lvhao
 * @since: 2016-10-13 16:07
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public User queryUser(long userId) {
        User user = null;
        if (userId == 1000L) {
            user = new User();
            user.setUserId(1000L);
            user.setUserName("tester");
        }
        return user;
    }
}
