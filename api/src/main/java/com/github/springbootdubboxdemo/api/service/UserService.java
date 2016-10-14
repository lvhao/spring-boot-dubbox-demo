package com.github.springbootdubboxdemo.api.service;

import com.github.springbootdubboxdemo.api.model.User;

import java.util.Optional;

/**
 * 用户相关接口
 *
 * @author: lvhao
 * @since: 2016-10-13 16:04
 */
public interface UserService {
    Optional<User> queryUser(long userId);
}
