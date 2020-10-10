package com.etc.service.impl;

import com.etc.dao.UserDao;
import com.etc.entity.User;
import com.etc.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public User getUserById(Integer uid) {
        User user = null;
        Optional<User> optional = userDao.findById(uid);
        if (optional.isPresent()){
            user = optional.get();
        }
        return user;
    }
}
