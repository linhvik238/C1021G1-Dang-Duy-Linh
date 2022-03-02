package com.codegym.repository.impl;

import com.codegym.model.EmailConfiguration;
import com.codegym.repository.EmailConfigurationRepo;

import java.util.ArrayList;
import java.util.List;

public class EmailConfigurationRepoImpl implements EmailConfigurationRepo {
    private static List<EmailConfiguration> emailConfigurationList;

    @Override
    public List<EmailConfiguration> findAll() {
        return emailConfigurationList;
    }


}
