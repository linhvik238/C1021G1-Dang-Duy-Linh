package com.codegym.service.impl;

import com.codegym.model.Customer;
import com.codegym.service.ICustomerService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class CustomerServiceImpl implements ICustomerService {
    private static final Map<Integer, Customer> customers;

    static {

        customers = new HashMap<>();
        customers.put(1, new Customer(1, "Anh Hoàng", "anhhoang@codegym.vn", "Hà Nội"));
        customers.put(2, new Customer(2, "Linh Đặng", "linhdang@gmail.com", "Đà Nẵng"));
        customers.put(3, new Customer(3, "Bảo Ngô", "baongo@codegym.vn", "Đà Nẵng"));
        customers.put(4, new Customer(4, "Nhật Hiếu", "nhathieu@gmail.com", "Quảng Nam"));
        customers.put(5, new Customer(5, "Duy Thuận", "duythuan@gmail.com", "Quảng Nam"));
        customers.put(6, new Customer(6, "Ngọc Đạt", "ngotdat@codegym.vn", "Quảng Trị"));
    }
    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id, customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}
