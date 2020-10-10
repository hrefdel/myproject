package com.etc.controller;

import com.etc.entity.User;
import com.etc.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/get/{uid}")
    public Map<String,Object> getUser(@PathVariable Integer uid, HttpSession session){
        Object user = session.getAttribute("user");
        System.out.println("从springcloudzuul中取:"+user);
        Map<String,Object> map = new HashMap<>();
        User u = userService.getUserById(uid);
        map.put("uid",u.getUid());
        map.put("uname",u.getUname());
        map.put("pwd",u.getPwd());
        return map;
    }
}
