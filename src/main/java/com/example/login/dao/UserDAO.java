package com.example.login.dao;

import com.example.login.core.User;
import com.example.login.core.UserMapper;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

import java.util.List;

public interface UserDAO {

    @SqlQuery("select * from user")
    @Mapper(UserMapper.class)
    List<User> findAll();

    @SqlQuery("select * from user where username = :username and password = :password")
    @Mapper(UserMapper.class)
    List<User> findUsersByUsernameAndPassword(
        @Bind("username") String username
        ,@Bind("password") String password
    );
}
