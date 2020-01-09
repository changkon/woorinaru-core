package com.woorinaru.core.model.user;

import com.woorinaru.core.model.base.Identifiable;
import com.woorinaru.core.model.management.administration.Resource;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;

public abstract class User implements Identifiable {

    protected int id;
    protected String name;
    protected String nationality;
    protected String email;
    protected Collection<Resource> favouriteResources;
    protected LocalDateTime signUpDateTime;
    protected LocalDateTime createDateTime;
    protected LocalDateTime updateDateTime;

    public User() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public LocalDateTime getSignUpDateTime() {
        return signUpDateTime;
    }

    public void setSignUpDateTime(LocalDateTime signupDateTime) {
        this.signUpDateTime = signupDateTime;
    }

    public boolean addFavouriteResource(Resource resource) {
        if (favouriteResources == null) {
            favouriteResources = new ArrayList<>();
        }
        return favouriteResources.add(resource);
    }

    public boolean removeFavouriteResource(int resourceId) {
        if (favouriteResources == null) {
            return false;
        }
        return favouriteResources.removeIf(resource -> resource.getId() == resourceId);
    }

    @Override
    public LocalDateTime getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(LocalDateTime createDateTime) {
        this.createDateTime = createDateTime;
    }

    @Override
    public LocalDateTime getUpdateDateTime() {
        return updateDateTime;
    }

    public void setUpdateDateTime(LocalDateTime updateDateTime) {
        this.updateDateTime = updateDateTime;
    }
}
