package woorinaru.core.model.user;

import woorinaru.core.model.management.administration.Resource;

import java.time.LocalDateTime;
import java.util.Collection;

public abstract class User {

    protected String name;
    protected String nationality;
    protected String email;
    protected Collection<Resource> favouriteResources;
    protected LocalDateTime signupDateTime;

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

    public Collection<Resource> getFavouriteResources() {
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

    public void setFavouriteResources(Collection<Resource> favouriteResources) {
        this.favouriteResources = favouriteResources;
    }

    public LocalDateTime getSignupDateTime() {
        return signupDateTime;
    }

    public void setSignupDateTime(LocalDateTime signupDateTime) {
        this.signupDateTime = signupDateTime;
    }
}
