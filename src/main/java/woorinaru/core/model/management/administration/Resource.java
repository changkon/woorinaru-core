package woorinaru.core.model.management.administration;

import woorinaru.core.model.base.Identifiable;

public interface Resource extends Identifiable {
    byte[] getResource();
    String getDescription();
}
