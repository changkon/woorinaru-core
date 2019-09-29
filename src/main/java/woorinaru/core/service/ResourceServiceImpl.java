package woorinaru.core.service;

import woorinaru.core.dao.spi.ResourceDao;
import woorinaru.core.model.management.administration.Resource;
import woorinaru.core.model.user.User;

import java.util.List;
import java.util.Optional;

public class ResourceServiceImpl implements GenericService<Resource> {

    private User userContext;

    private ResourceDao resourceDao;

    public ResourceServiceImpl() {}

    @Override
    public void create(Resource resource) {
        this.resourceDao.create(resource);
    }

    @Override
    public Optional<Resource> get(int id) {
        return resourceDao.get(id);
    }

    @Override
    public void delete(Resource resource) {
        resourceDao.delete(resource);
    }

    @Override
    public void modify(Resource resource) {
        resourceDao.modify(resource);
    }

    @Override
    public List<Resource> getAll() {
        return resourceDao.getAll();
    }

    @Override
    public User getUserContext() {
        return this.userContext;
    }

    public void setUserContext(User userContext) {
        this.userContext = userContext;
    }

    public ResourceDao getResourceDao() {
        return resourceDao;
    }

    public void setResourceDao(ResourceDao resourceDao) {
        this.resourceDao = resourceDao;
    }
}
