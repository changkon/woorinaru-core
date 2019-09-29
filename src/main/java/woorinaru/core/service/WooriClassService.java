package woorinaru.core.service;

import woorinaru.core.model.management.administration.WooriClass;

import java.util.function.Predicate;

public interface WooriClassService extends GenericService<WooriClass> {
    <C extends WooriClass> C getWooriClassesByType(Predicate<C> filter);
}
