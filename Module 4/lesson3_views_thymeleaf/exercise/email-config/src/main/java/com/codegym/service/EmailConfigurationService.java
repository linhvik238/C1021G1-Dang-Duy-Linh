package com.codegym.service;

import com.codegym.model.EmailConfiguration;

import java.util.List;

public interface EmailConfigurationService {
    public List<EmailConfiguration> findAll();
}
