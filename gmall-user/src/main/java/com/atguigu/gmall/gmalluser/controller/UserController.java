package com.atguigu.gmall.gmalluser.controller;

import com.atguigu.gmall.bean.UserInfo;
import com.atguigu.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("userInfoList")
    //@ResponseBody
    public ResponseEntity<List<UserInfo>> userInfoList(){
        List<UserInfo> list = userService.userInfoList();
        return ResponseEntity.ok(list);
    }
}
