package woorinaru.core.service;

import java.util.List;
import java.util.Optional;

public interface GenericService<E> extends UserAuthService {
    void create(E e);
    Optional<E> get(int id);
    void delete(E e);
    void modify(E e);
    List<E> getAll();
}
