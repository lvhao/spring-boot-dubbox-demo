package com.github.springbootdubboxdemo.api.service;

import com.github.springbootdubboxdemo.api.common.Response;
import com.github.springbootdubboxdemo.api.model.UserModel;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * 用户相关接口
 *
 * @author: lvhao
 * @since: 2016-10-13 16:04
 */
public interface UserService {
    Response<UserModel> queryUser(@NotNull @Min(1) Long userId);
}
