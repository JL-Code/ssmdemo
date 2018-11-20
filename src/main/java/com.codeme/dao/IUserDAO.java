package com.codeme.dao;

import com.codeme.entity.User;

public interface IUserDAO {
    User findUserById(int id) throws Exception;
}
