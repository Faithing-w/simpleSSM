package com.wyz.service.impl;

import com.wyz.entity.User;
import com.wyz.repository.UserRepository;
import com.wyz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    public void doSomething(User user){
        Logger logger = Logger.getLogger("UserServiceImpl");
        logger.info("doSomething" + user.getName());
    }

    public void doSomething2(User user){
        Logger logger = Logger.getLogger("UserServiceImpl");
        logger.info("doSomething2" + user.getName());
    }
}
