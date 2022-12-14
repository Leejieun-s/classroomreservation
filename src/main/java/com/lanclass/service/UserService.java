package com.lanclass.service;

import com.lanclass.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/12/14/23:51
 */

@Repository
public interface UserService {
    List<User> findalluser();
}
