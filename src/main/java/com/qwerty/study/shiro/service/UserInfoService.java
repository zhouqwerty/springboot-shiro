package com.qwerty.study.shiro.service;

import com.qwerty.study.shiro.entity.UserInfo;

public interface UserInfoService {
    UserInfo findByUsername(String username);
}
