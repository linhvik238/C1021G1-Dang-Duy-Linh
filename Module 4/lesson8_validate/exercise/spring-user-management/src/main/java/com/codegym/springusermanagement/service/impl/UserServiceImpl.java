package com.codegym.springusermanagement.service.impl;

import com.codegym.springusermanagement.model.User;
import com.codegym.springusermanagement.repository.IUserRepository;
import com.codegym.springusermanagement.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserRepository userRepository;
    @Override
    public void create(User user) {
        userRepository.save(user);
    }
}
