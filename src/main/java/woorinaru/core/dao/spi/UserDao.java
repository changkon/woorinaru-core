package woorinaru.core.dao.spi;

import woorinaru.core.model.user.User;

import java.util.List;
import java.util.Optional;

public interface UserDao<U extends User> {
    U createUser(String username, String password);
    Optional<U> getUser(String username);
    void deleteUser(U user);
    U modifyUser(U user);
    List<U> getAllUsers();
}
