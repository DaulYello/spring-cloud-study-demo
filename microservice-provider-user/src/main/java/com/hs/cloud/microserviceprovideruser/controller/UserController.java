package com.hs.cloud.microserviceprovideruser.controller;


import com.hs.cloud.microserviceprovideruser.dao.UserDao;
import com.hs.cloud.microserviceprovideruser.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserDao userDao;

    @GetMapping("/user/info/{id}")
    public User getUserInfo(@PathVariable Long id){
        return this.userDao.getOne(id);
    }
}
