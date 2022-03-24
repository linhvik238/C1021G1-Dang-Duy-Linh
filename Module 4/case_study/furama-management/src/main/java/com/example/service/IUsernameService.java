package com.example.service;

import com.example.model.login.Username;

import java.util.List;

public interface IUsernameService {
    List<Username> findAll();
    Username findById(Long id);

    Username findByUsername(Long id);

    Username findByUsername(String name);
}
