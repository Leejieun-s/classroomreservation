package com.lanclass.dao;

import com.lanclass.dao.UserMapper;
import com.lanclass.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2023/01/01/0:18
 */
@Mapper
@Repository("userDAO")
public interface UserDao {
    public <Users> List<Users> getUsersByCond(Users users);
}
