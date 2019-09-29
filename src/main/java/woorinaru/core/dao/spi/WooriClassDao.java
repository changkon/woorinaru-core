package woorinaru.core.dao.spi;

import woorinaru.core.model.management.administration.WooriClass;

import java.util.function.Predicate;

public interface WooriClassDao extends GenericDao<WooriClass> {
    <C extends WooriClass> C getWooriClassByType(Predicate<C> filter);
}
