package service;

import model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserService {
    public void insertUser(User user) throws SQLException;

    public User selectUser(int id);

    public List<User> selectAllUsers();

    public boolean deleteUser(int id) throws SQLException;

    public void updateUser(User user) throws SQLException;

    List<User> findByCountry (String country);

    public User getUserById(int id);

    public void insertUserStore(User user);


}
