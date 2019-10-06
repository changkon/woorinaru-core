package woorinaru.core.model.user;

import woorinaru.core.model.base.Identifiable;
import woorinaru.core.model.management.administration.Resource;

import java.util.List;

public abstract class User implements Identifiable {

    protected int id;
    protected String name;
    protected String nationality;
    protected String email;
    protected List<Resource> favouriteResources;

    public User() {}

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public String getEmail() {
        return email;
    }

    public List<Resource> getFavouriteResources() {
        return favouriteResources;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFavouriteResources(List<Resource> favouriteResources) {
        this.favouriteResources = favouriteResources;
    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
