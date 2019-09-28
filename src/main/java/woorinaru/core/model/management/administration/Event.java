package woorinaru.core.model.management.administration;

import java.time.LocalDateTime;
import java.util.List;

public interface Event {
    LocalDateTime getStartTime();
    LocalDateTime getEndTime();
    String getAddress();
    String getDescription();
    List<WooriClass> getWooriClasses();
}
