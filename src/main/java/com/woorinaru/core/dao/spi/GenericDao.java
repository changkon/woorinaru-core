package com.woorinaru.core.dao.spi;

import java.util.List;

public interface GenericDao<E> {
    int create(E e);
    E get(int id);
    void delete(E e);
    void modify(E e);
    List<E> getAll();
}
