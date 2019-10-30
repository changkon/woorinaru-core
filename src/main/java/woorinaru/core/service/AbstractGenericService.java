package woorinaru.core.service;

import woorinaru.core.dao.spi.GenericDao;
import woorinaru.core.model.user.User;

import java.util.List;
import java.util.Optional;

public abstract class AbstractGenericService<E, D extends GenericDao<E>> implements GenericService<E>, UserAuthService {

    protected D dao;

    protected User userContext;

    public AbstractGenericService() {}

    @Override
    public void create(E e) {
        dao.create(e);
    }

    @Override
    public Optional<E> get(int id) {
        return dao.get(id);
    }

    @Override
    public void delete(E e) {
        dao.delete(e);
    }

    @Override
    public void modify(E e) {
        dao.modify(e);
    }

    @Override
    public List<E> getAll() {
        return dao.getAll();
    }

    public D getDao() {
        return dao;
    }

    public void setDao(D dao) {
        this.dao = dao;
    }

    @Override
    public User getUserContext() {
        return userContext;
    }

    public void setUserContext(User userContext) {
        this.userContext = userContext;
    }
}
