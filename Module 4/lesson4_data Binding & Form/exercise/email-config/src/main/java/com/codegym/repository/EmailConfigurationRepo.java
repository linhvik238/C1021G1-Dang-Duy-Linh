package com.codegym.repository;

import com.codegym.model.EmailConfiguration;

import java.util.List;

public interface EmailConfigurationRepo {
    public List<EmailConfiguration> findAll();
}
