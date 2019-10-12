package woorinaru.core.model.management.administration;

public class Resource {

    private byte[] resource;
    private String description;

    public Resource() {}

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
