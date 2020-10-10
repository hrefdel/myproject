package com.etc.dao;

import com.etc.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface UserDao extends JpaRepository<User,Integer>, JpaSpecificationExecutor<User>, Serializable {
}
