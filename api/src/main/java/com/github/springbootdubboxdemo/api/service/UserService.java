package com.github.springbootdubboxdemo.api.service;

import com.github.springbootdubboxdemo.api.model.UserModel;

/**
 * 用户相关接口
 *
 * @author: lvhao
 * @since: 2016-10-13 16:04
 */
public interface UserService {
    UserModel queryUser(Long userId);
}
