package com.example.repository.customer;

import com.example.model.person.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerTypeRepository extends JpaRepository<CustomerType, Long> {
}
