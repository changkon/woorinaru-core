package woorinaru.core.dao.spi;

import java.util.List;
import java.util.Optional;

public interface GenericDao<E> {
    void create(E e);
    Optional<E> get(int id);
    void delete(E e);
    void modify(E e);
    List<E> getAll();
}