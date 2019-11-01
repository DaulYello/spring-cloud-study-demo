package com.hs.cloud.microserviceprovideruser.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 因为用了jpa，实体上需要加上它的组建
 * 因为jsonplugin用的是java的内审机制.hibernate会给被管理的pojo加入一个hibernateLazyInitializer属性,
 * jsonplugin会把hibernateLazyInitializer也拿出来操作,并读取里面一个不能被反射操作的属性就产生了这个异常.  
 * 不过我用的是jackson来转json，所以想到了用annotation来排除hibernateLazyInitializer 这个属性
 * 原文链接：https://blog.csdn.net/a57565587/article/details/43151239
 */
@Entity
@JsonIgnoreProperties(value = { "hibernateLazyInitializer"})
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String username;
    @Column
    private String name;
    @Column
    private int age;
    @Column
    private BigDecimal balance;

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
