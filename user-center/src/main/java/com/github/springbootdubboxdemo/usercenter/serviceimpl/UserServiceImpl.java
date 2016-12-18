package com.github.springbootdubboxdemo.usercenter.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.springbootdubboxdemo.api.model.UserModel;
import com.github.springbootdubboxdemo.api.service.UserService;

import java.util.Optional;

/**
 * 用户接口实现
 *
 * @author: lvhao
 * @since: 2016-10-13 16:07
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserModel queryUser(Long userId) {
        UserModel user = null;
        if (userId == 1000L) {
            user = new UserModel();
            user.setId(1000L);
            user.setName("tester");
        }
        return user;
    }
}
