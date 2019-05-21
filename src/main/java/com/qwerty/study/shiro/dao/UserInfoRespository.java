package com.qwerty.study.shiro.dao;

import com.qwerty.study.shiro.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoRespository extends JpaRepository<UserInfo,Integer> {
    UserInfo findByUsername(String username);
}
