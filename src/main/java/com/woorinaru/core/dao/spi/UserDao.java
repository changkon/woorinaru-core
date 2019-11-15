package com.woorinaru.core.dao.spi;

import com.woorinaru.core.model.user.User;

public interface UserDao {
    User get(int id);
    void modifyUserType(User user, Class<? extends User> userType);
}
