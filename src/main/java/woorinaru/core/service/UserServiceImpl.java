package woorinaru.core.service;

import woorinaru.core.dao.spi.UserDao;
import woorinaru.core.model.user.User;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl<U extends User> extends AbstractGenericService<U, UserDao<U>> implements UserService<U> {
}
