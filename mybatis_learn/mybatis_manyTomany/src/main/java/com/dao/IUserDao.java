package com.dao;

import com.bean.User;

import java.util.List;

public interface IUserDao {
    List<User> findAll();
}
