package woorinaru.core.command.management.administration;

import woorinaru.core.command.UpdateCommand;
import woorinaru.core.model.management.administration.Resource;

public abstract class ResourceUpdateCommand implements UpdateCommand<Resource> {

    protected Resource resource;

    public ResourceUpdateCommand(Resource resource) {
        this.resource = resource;
    }

    @Override
    public Resource getReceiver() {
        return this.resource;
    }

    @Override
    public void setReceiver(Resource receiver) {
        this.resource = receiver;
    }
}
