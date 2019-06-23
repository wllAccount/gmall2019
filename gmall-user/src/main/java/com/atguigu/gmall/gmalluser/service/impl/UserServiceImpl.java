package com.atguigu.gmall.gmalluser.service.impl;

import com.atguigu.gmall.bean.UserInfo;
import com.atguigu.gmall.gmalluser.mapper.UserMapper;
import com.atguigu.gmall.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;

    @Override
    public List<UserInfo> userInfoList() {
        return userMapper.selectAll();
    }
}
