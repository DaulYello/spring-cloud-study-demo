package com.hs.cloud.microserviceprovideruser.dao;


import com.hs.cloud.microserviceprovideruser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User,Long> {
}
