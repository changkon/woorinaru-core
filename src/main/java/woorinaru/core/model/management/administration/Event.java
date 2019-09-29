package woorinaru.core.model.management.administration;

import woorinaru.core.model.base.Identifiable;

import java.time.LocalDateTime;
import java.util.List;

public interface Event extends Identifiable {
    LocalDateTime getStartTime();
    LocalDateTime getEndTime();
    String getAddress();
    String getDescription();
    List<WooriClass> getWooriClasses();
}
