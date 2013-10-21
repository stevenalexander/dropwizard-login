package com.example.login.dao;

import com.example.login.core.Session;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;

import java.util.List;

public interface SessionDAO {
    @SqlUpdate("insert into session (access_token, username, created) values (:accessToken, :username, :created)")
    void insert(
        @Bind("accessToken") String accessToken
        ,@Bind("username") String username
        ,@Bind("created") java.util.Date created
    );
}
