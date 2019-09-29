package woorinaru.core.service;

import woorinaru.core.dao.spi.WooriClassDao;
import woorinaru.core.model.management.administration.WooriClass;
import java.util.function.Predicate;

public class WooriClassServiceImpl extends AbstractGenericService<WooriClass, WooriClassDao> implements WooriClassService {
    @Override
    public <C extends WooriClass> C getWooriClassesByType(Predicate<C> filter) {
        return this.dao.getWooriClassByType(filter);
    }
}
