package com.codegym.phonemanagement.service.impl;

import com.codegym.phonemanagement.model.SmartPhone;
import com.codegym.phonemanagement.repository.ISmartphoneRepository;
import com.codegym.phonemanagement.service.ISmartPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class SmartPhoneServiceImpl implements ISmartPhoneService {
    @Autowired
    private ISmartphoneRepository smartphoneRepository;

    @Override
    public Iterable<SmartPhone> findAll() {
        return smartphoneRepository.findAll();
    }

    @Override
    public Optional<SmartPhone> findById(Long id) {
        return smartphoneRepository.findById(id);
    }

    @Override
    public SmartPhone save(SmartPhone smartPhone) {
        return smartphoneRepository.save(smartPhone);
    }

    @Override
    public void remove(Long id) {
        smartphoneRepository.deleteById(id);
    }
}
