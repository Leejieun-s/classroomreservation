package com.lanclass.service;

import com.lanclass.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/12/14/23:51
 */

@Service("userService")
public interface UserService {
    List<User> findalluser();


    public List<User> getUsersByCond(User user);

    List<User> getUsersByCond();
}
