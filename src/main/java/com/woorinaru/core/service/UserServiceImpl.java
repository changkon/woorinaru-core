package com.woorinaru.core.service;

import com.woorinaru.core.dao.spi.UserDao;
import com.woorinaru.core.model.user.Admin;
import com.woorinaru.core.model.user.Staff;
import com.woorinaru.core.model.user.StaffRole;
import com.woorinaru.core.model.user.User;

import java.util.Objects;

public class UserServiceImpl implements UserService, UserAuthService {

    private UserDao userDao;
    private User userContext;

    @Override
    public User get(int id) {
        return this.userDao.get(id);
    }

    @Override
    public User getByEmail(String email) {
        return this.userDao.getByEmail(email);
    }

    @Override
    public void modifyUserType(User user, Class<? extends User> userType) {
        if (isAllowedToModifyUserType(user, userType)) {
            this.userDao.modifyUserType(user, userType);
        }
        throw new SecurityException("User does not have supported privilege to modify user permission");
    }

    /**
     * Determines if the user in context is allowed to modify other users permission levels.
     * @param user
     * @return permission granted
     */
    public boolean isAllowedToModifyUserType(User user, Class<? extends User> userType) {
        if (Objects.isNull(userContext) || Objects.isNull(user)) {
            // Cannot modify if userContext/user is not available or if trying to set visitor to a
            return false;
        }

        if (userContext instanceof Admin) {
            // All admin users are given full privilege
            return true;
        }

        if (userContext instanceof Staff) {
            Staff staffContext = (Staff) userContext;
            StaffRole staffRole = staffContext.getStaffRole();

            if (staffRole.equals(StaffRole.LEADER)) {
                // Staff role are allowed to update every user except admin users. They can only elevate role up to LEADER role
                if (user instanceof Admin) {
                    return false;
                } else {
                    return !(userType == Admin.class);
                }
            }
        }

        return false;
    }

    public UserDao getDao() {
        return userDao;
    }

    public void setDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public User getUserContext() {
        return userContext;
    }

    public void setUserContext(User userContext) {
        this.userContext = userContext;
    }
}
