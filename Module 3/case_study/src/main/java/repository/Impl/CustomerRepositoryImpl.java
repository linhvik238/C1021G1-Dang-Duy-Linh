package repository.Impl;

import model.customer.Customer;
import repository.CustomerRepository;
import repository.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static util.CustomerCodeCreating.setCode;

public class CustomerRepositoryImpl implements CustomerRepository {
    private static final String SELECT_ALL_CUSTOMER = "select * from customer join customer_type on customer.customer_type_id = customer_type.customer_type_id;";
    private static final String INSERT_CUSTOMER = "insert into furama_case_study.customer (customer_name, customer_birthday, customer_gender, customer_id_card, customer_phone, customer_email, " +
            "customer_address, customer_type_id)" +
            "values (?, ?, ?, ?, ?, ?, ?, ?);";
    private static final String UPDATE_CUSTOMER = "update customer set customer_name=?, customer_birthday=?, customer_gender=?, customer_id_card=?,  customer_phone=?, customer_email=?," +
            "customer_address=?, customer_type_id=? where customer_id=?;";
    public static final String SELECT_USER_BY_ID = "select * from customer where customer_id = ?;";
    private static final String DELETE_USER_BY_ID = "delete from customer where customer_id = ?;";

    @Override
    public List<Customer> findAll() {
        Connection connection = DBConnection.getConnection();
        List<Customer> customerList = new ArrayList<>();
        ResultSet rs = null;
        PreparedStatement preparedStatement = null;

        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMER);
                rs = preparedStatement.executeQuery();

                while (rs.next()) {
                    int customerId = rs.getInt("customer_id");
                    String customerCode = setCode("KH-", customerId);
                    String customerName = rs.getString("customer_name");
                    String customerBirthday = rs.getString("customer_birthday");
                    boolean gender = rs.getBoolean("customer_gender");
                    String customerIdCard = rs.getString("customer_id_card");
                    String customerPhone = rs.getString("customer_phone");
                    String customerEmail = rs.getString("customer_email");
                    String customerAddress = rs.getString("customer_address");
                    int customerTypeId = rs.getInt("customer_type_id");
                    String customerTypeName = rs.getString("customer_type_name");
                    customerList.add(new Customer(customerId, customerCode, customerName, customerBirthday, gender, customerIdCard, customerPhone, customerEmail,
                            customerAddress, customerTypeId, customerTypeName));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        return customerList;
    }

    @Override
    public void create(Customer customer) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = null;

        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(INSERT_CUSTOMER);
                preparedStatement.setString(1, customer.getCustomerName());
                preparedStatement.setString(2, customer.getCustomerBirthday());
                preparedStatement.setBoolean(3, customer.isGender());
                preparedStatement.setString(4, customer.getCustomerIdCard());
                preparedStatement.setString(5, customer.getCustomerPhone());
                preparedStatement.setString(6, customer.getCustomerEmail());
                preparedStatement.setString(7, customer.getCustomerAddress());
                preparedStatement.setInt(8, customer.getCustomerTypeId());

                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        boolean rowUpdate = false;
        try {
            Connection connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_CUSTOMER);
            preparedStatement.setString(1, customer.getCustomerName());
            preparedStatement.setString(2, customer.getCustomerBirthday());
            preparedStatement.setBoolean(3, customer.isGender());
            preparedStatement.setString(4, customer.getCustomerIdCard());
            preparedStatement.setString(5, customer.getCustomerPhone());
            preparedStatement.setString(6, customer.getCustomerEmail());
            preparedStatement.setString(7, customer.getCustomerAddress());
            preparedStatement.setInt(8, customer.getCustomerTypeId());
            preparedStatement.setInt(9, customer.getCustomerId());
            rowUpdate = preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowUpdate;
    }

    @Override
    public Customer getCustomerById(int id) {
        Customer customer = null;
        try {
            Connection connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int customerId = rs.getInt("customer_id");
                String customerCode = setCode("KH-", customerId);
                String customerName = rs.getString("customer_name");
                String customerBirthday = rs.getString("customer_birthday");
                boolean gender = rs.getBoolean("customer_gender");
                String customerIdCard = rs.getString("customer_id_card");
                String customerPhone = rs.getString("customer_phone");
                String customerEmail = rs.getString("customer_email");
                String customerAddress = rs.getString("customer_address");
                int customerTypeId = rs.getInt("customer_type_id");
                customer = new Customer(customerId, customerCode, customerName, customerBirthday, gender, customerIdCard, customerPhone, customerEmail, customerAddress, customerTypeId);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customer;
    }

    @Override
    public void deleteCustomer(int id) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = null;
        if (connection != null)
            try {
                preparedStatement = connection.prepareStatement(DELETE_USER_BY_ID);
                preparedStatement.setInt(1, id);
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
    }
}


