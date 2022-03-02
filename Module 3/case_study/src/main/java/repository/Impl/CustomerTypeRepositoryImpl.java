package repository.Impl;

import model.customer.CustomerType;
import repository.CustomerTypeRepository;
import repository.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerTypeRepositoryImpl implements CustomerTypeRepository {
    private static final String SELECT_ALL_CUSTOMER_TYPE = "select * from customer_type;";
    @Override
    public List<CustomerType> findAll() {
        Connection connection = DBConnection.getConnection();
        List<CustomerType> customerTypeList = new ArrayList<>();
        ResultSet rs = null;
        PreparedStatement preparedStatement = null;

        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMER_TYPE);
                rs = preparedStatement.executeQuery();

                while (rs.next()) {
                    int customerTypeId = rs.getInt("customer_type_id");
                    String customerTypeName = rs.getString("customer_type_name");
                    customerTypeList.add(new CustomerType(customerTypeId, customerTypeName));
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
        return customerTypeList;
    }
}
