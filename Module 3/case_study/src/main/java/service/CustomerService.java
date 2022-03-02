package service;

import model.customer.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    void create (Customer customer);
    void updateCustomer(Customer customer);
    void deleteCustomer(int id);
}
