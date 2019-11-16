package com.woorinaru.core.service;

import com.woorinaru.core.model.user.User;

public interface UserService {
    User get(int id);
    User getByEmail(String email);
    void modifyUserType(User user, Class<? extends User> userType);
}
