package com.lanclass.service.Impl;

import com.lanclass.dao.UserMapper;
import com.lanclass.entity.User;
import com.lanclass.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/12/14/23:53
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findalluser() {

        return userMapper.selectUser();
    }
}
