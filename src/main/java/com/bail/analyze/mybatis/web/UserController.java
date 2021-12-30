package com.bail.analyze.mybatis.web;

import com.bail.analyze.mybatis.domain.User;
import com.bail.analyze.mybatis.service.UserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description：create
 * @author: ext.liukai3
 * @date: 2021/12/30 17:11
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("save")
    public int saveUser(@RequestBody User user){
        int save = userService.save(user);
        return save;
    }

}
