package repository;

import model.customer.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
    void create(Customer customer);
    boolean updateCustomer (Customer customer);

    Customer getCustomerById(int id);

    void deleteCustomer(int id);
}
