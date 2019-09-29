package woorinaru.core.service;

import woorinaru.core.dao.spi.WooriClassDao;
import woorinaru.core.model.management.administration.WooriClass;
import woorinaru.core.model.user.User;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class WooriClassServiceImpl implements WooriClassService {

    private WooriClassDao wooriClassDao;

    private User userContext;

    public WooriClassServiceImpl() {}

    @Override
    public void create(WooriClass wooriClass) {
        this.wooriClassDao.create(wooriClass);
    }

    @Override
    public Optional<WooriClass> get(int id) {
        return this.wooriClassDao.get(id);
    }

    @Override
    public void delete(WooriClass wooriClass) {
        this.wooriClassDao.delete(wooriClass);
    }

    @Override
    public void modify(WooriClass wooriClass) {
        this.wooriClassDao.modify(wooriClass);
    }

    @Override
    public List<WooriClass> getAll() {
        return this.wooriClassDao.getAll();
    }

    @Override
    public <C extends WooriClass> C getWooriClassesByType(Predicate<C> filter) {
        return this.wooriClassDao.getWooriClassByType(filter);
    }

    @Override
    public User getUserContext() {
        return this.userContext;
    }

    public void setUserContext(User userContext) {
        this.userContext = userContext;
    }

    public WooriClassDao getWooriClassDao() {
        return wooriClassDao;
    }

    public void setWooriClassDao(WooriClassDao wooriClassDao) {
        this.wooriClassDao = wooriClassDao;
    }
}
