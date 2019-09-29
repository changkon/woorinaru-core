package woorinaru.core.service;

import woorinaru.core.dao.spi.TermDao;
import woorinaru.core.model.management.administration.Term;
import woorinaru.core.model.user.User;

import java.util.List;
import java.util.Optional;

public class TermServiceImpl implements GenericService<Term> {

    private TermDao termDao;

    private User userContext;

    public TermServiceImpl() {}

    @Override
    public void create(Term term) {
        this.termDao.create(term);
    }

    @Override
    public Optional<Term> get(int id) {
        return this.termDao.get(id);
    }

    @Override
    public void delete(Term term) {
        this.termDao.delete(term);
    }

    @Override
    public void modify(Term term) {
        this.termDao.modify(term);
    }

    @Override
    public List<Term> getAll() {
        return this.termDao.getAll();
    }

    @Override
    public User getUserContext() {
        return this.userContext;
    }

    public void setUserContext(User userContext) {
        this.userContext = userContext;
    }

    public TermDao getTermDao() {
        return termDao;
    }

    public void setTermDao(TermDao termDao) {
        this.termDao = termDao;
    }
}
