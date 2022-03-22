package com.example.model;

import com.example.model.person.Username;

import java.util.List;

public interface IUsernameService {
    List<Username> findAll();
    Username findById(Long id);

    Username findByUsername(Long id);

    Username findByUsername(String name);
}
