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
    public void create(U user) {
        userDao.create(user);
    }

    @Override
    public Optional<U> get(int id) {
        return userDao.get(id);
    }

    @Override
    public void delete(U user) {
        userDao.delete(user);
    }

    @Override
    public void modify(U user) {
        userDao.modify(user);
    }

    @Override
    public List<U> getAll() {
        return userDao.getAll();
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
