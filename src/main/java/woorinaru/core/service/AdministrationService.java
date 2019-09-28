package woorinaru.core.service;

import woorinaru.core.model.management.administration.Event;
import woorinaru.core.model.management.administration.Resource;
import woorinaru.core.model.management.administration.Term;
import woorinaru.core.model.management.administration.WooriClass;

import java.util.List;
import java.util.Optional;

public interface AdministrationService {
    // Term management
    Term createTerm(int termNumber);
    Optional<Term> getTerm(int termNumber);
    void deleteTerm(Term term);
    List<Term> getAllTerms();

    // Class management
    Event createEvent();
    Optional<Event> getEvent();
    void deleteEvent(Event event);
    List<Event> getAllEvents();

    WooriClass createWooriClass();
    Optional<WooriClass> getWooriClass();
    void deleteWooriClass(WooriClass wooriClass);
    List<WooriClass> getAllWooriClasses();

    Resource createResource();
    Optional<Resource> getResource();
    void deleteResource(Resource resource);
    List<Resource> getAllResources();
}
