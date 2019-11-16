package com.woorinaru.core.dao.spi;

import com.woorinaru.core.model.user.User;

public interface UserDao {
    User get(int id);
    User getByEmail(String email);
    void modifyUserType(User user, Class<? extends User> userType);
}
