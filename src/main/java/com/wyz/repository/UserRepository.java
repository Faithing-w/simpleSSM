package com.wyz.repository;

import com.wyz.entity.User;

import java.util.List;

public interface UserRepository {
    public List<User> findAll();
}
