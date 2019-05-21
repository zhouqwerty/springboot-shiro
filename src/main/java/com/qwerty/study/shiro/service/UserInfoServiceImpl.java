package com.qwerty.study.shiro.service;

import com.qwerty.study.shiro.dao.UserInfoRespository;
import com.qwerty.study.shiro.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService{

    @Autowired
    private UserInfoRespository userInfoRespository;
    @Override
    public UserInfo findByUsername(String username) {
        return userInfoRespository.findByUsername(username);
    }
}
