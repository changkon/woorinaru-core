package woorinaru.core.service;

import woorinaru.core.dao.spi.UserDao;
import woorinaru.core.model.user.User;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl<U extends User> implements UserService<U> {

    private UserDao<U> userDao;

    // Not sure if this is correct
    private User userContext;

    // Empty constructor
    public UserServiceImpl() {}

    @Override
    public U createUser(String username, String password) {
        return userDao.createUser(username, password);
    }

    @Override
    public Optional<U> getUser(String username) {
        return userDao.getUser(username);
    }

    @Override
    public void deleteUser(U user) {
        userDao.deleteUser(user);
    }

    @Override
    public U modifyUser(U user) {
        return userDao.modifyUser(user);
    }

    @Override
    public List<U> getAllUsers() {
        return userDao.getAllUsers();
    }

    public UserDao<U> getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao<U> userDao) {
        this.userDao = userDao;
    }

    public User getUserContext() {
        return userContext;
    }

    public void setUserContext(User userContext) {
        this.userContext = userContext;
    }
}
