package com.codegym.service.impl;

import com.codegym.model.Login;
import com.codegym.model.User;
import com.codegym.repository.UserRepository;
import com.codegym.repository.impl.UserRepositoryImpl;
import com.codegym.service.UserService;

public class UserServiceImpl implements UserService {
    public UserRepository userRepository = new UserRepositoryImpl();
    @Override
    public User checkLogin(Login login) {
       return userRepository.checkLogin(login);
    }
}
