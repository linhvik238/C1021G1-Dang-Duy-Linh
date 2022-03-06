package com.codegym.service.impl;

import com.codegym.model.EmailConfiguration;
import com.codegym.repository.EmailConfigurationRepo;
import com.codegym.repository.impl.EmailConfigurationRepoImpl;
import com.codegym.service.EmailConfigurationService;
import org.springframework.stereotype.Service;

import java.util.List;

public class EmailConfigurationServiceImpl implements EmailConfigurationService {
    public EmailConfigurationRepo emailConfigurationRepo = new EmailConfigurationRepoImpl();


    @Override
    public List<EmailConfiguration> findAll() {
        return emailConfigurationRepo.findAll();
    }
}
