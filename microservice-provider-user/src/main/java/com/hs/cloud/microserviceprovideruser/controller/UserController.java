package com.hs.cloud.microserviceprovideruser.controller;


import com.hs.cloud.microserviceprovideruser.dao.UserDao;
import com.hs.cloud.microserviceprovideruser.entity.User;
import com.netflix.appinfo.ApplicationInfoManager;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.DiscoveryClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private static Logger LOG = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserDao userDao;

    /*@Autowired
    private DiscoveryClient discoveryClient;*/



    @GetMapping("/user/info/{id}")
    public User getUserInfo(@PathVariable Long id){

        /*ApplicationInfoManager infoManager =discoveryClient.getApplicationInfoManager();

        InstanceInfo instanceInfo =infoManager.getInfo();

        LOG.info("user host:"+instanceInfo.getHostName()+",service_id:"+instanceInfo.getId());*/

        return this.userDao.getOne(id);
    }
}
