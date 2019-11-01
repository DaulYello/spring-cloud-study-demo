package com.hs.cloud.microserviceconsumemovie.controller;


import com.hs.cloud.microserviceconsumemovie.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${user.userServicePath}")
    private String userServicePath;

    @GetMapping("/movie/info/{id}")
    public User getUserInfo(@PathVariable Long id){
        return this.restTemplate.getForObject(this.userServicePath+id,User.class);
    }
}
