package com.woorinaru.core.model.management.administration;

import com.woorinaru.core.model.base.Identifiable;

public class Resource implements Identifiable {

    private int id;
    private byte[] resource;
    private String description;

    public Resource() {}

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public byte[] getResource() {
        return resource;
    }

    public String getDescription() {
        return description;
    }

    public void setResource(byte[] resource) {
        this.resource = resource;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
