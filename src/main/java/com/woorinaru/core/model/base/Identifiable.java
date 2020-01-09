package com.woorinaru.core.model.base;

import java.time.LocalDateTime;

public interface Identifiable {
    int getId();
    LocalDateTime getCreateDateTime();
    LocalDateTime getUpdateDateTime();
}
