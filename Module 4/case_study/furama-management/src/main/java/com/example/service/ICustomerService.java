package com.example.service;

import com.example.model.person.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ICustomerService {
    Page<Customer> customerList(Pageable pageable);
    void save(Customer customer);
    Optional<Customer> findById(Long id);
    void deleteCustomer(Customer customer);
}
