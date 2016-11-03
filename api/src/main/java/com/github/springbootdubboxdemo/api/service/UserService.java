package com.github.springbootdubboxdemo.api.service;

import com.github.springbootdubboxdemo.api.model.User;

/**
 * 用户相关接口
 *
 * @author: lvhao
 * @since: 2016-10-13 16:04
 */
public interface UserService {
    User queryUser(long userId);
}
