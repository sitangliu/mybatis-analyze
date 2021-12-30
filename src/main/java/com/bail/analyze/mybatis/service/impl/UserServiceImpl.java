package com.bail.analyze.mybatis.service.impl;

import com.bail.analyze.mybatis.domain.User;
import com.bail.analyze.mybatis.mapper.UserDao;
import com.bail.analyze.mybatis.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description：create
 * @author: ext.liukai3
 * @date: 2021/12/30 17:09
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public int save(User user) {
        int insert = userDao.insert(user);
        return insert;
    }
}
