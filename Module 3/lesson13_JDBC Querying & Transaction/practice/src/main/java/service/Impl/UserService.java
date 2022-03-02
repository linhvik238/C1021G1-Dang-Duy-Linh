package service.Impl;

import model.User;
import repository.Impl.UserRepository;
import service.IUserService;

import java.sql.SQLException;
import java.util.List;

public class UserService implements IUserService {
    UserRepository userRepository = new UserRepository();

    @Override
    public void insertUser(User user) throws SQLException {
        userRepository.insertUser(user);
    }

    @Override
    public User selectUser(int id) {
        User user = this.userRepository.selectUser(id);
        return user;
    }
    @Override
    public List<User> selectAllUsers() {
        List<User> userList = this.userRepository.selectAllUsers();
        return userList;
    }

    @Override
    public boolean deleteUser(int id) throws SQLException {
        return false;
    }

    @Override
    public void updateUser(User user) throws SQLException {
        userRepository.updateUser(user);
    }

    @Override
    public User getUserById(int id) {
        User user = this.userRepository.getUserById(id);
        return user;
    }

    @Override
    public void insertUserStore(User user) {
        try {
            this.userRepository.insertUserStore(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<User> findByCountry(String country) {
        List<User> userList = this.userRepository.findByCountry(country);
        return userList;
    }


}


