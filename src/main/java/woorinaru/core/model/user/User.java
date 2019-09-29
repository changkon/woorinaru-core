package woorinaru.core.model.user;

import woorinaru.core.model.base.Identifiable;
import woorinaru.core.model.management.administration.Resource;

import java.util.List;

public interface User extends Identifiable {
    String getName();
    String getNationality();
    String getEmail();
    String getUsername();
    List<Resource> getFavouriteResources();
}
