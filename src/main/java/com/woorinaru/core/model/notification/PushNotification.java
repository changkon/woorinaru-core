package com.woorinaru.core.model.notification;

import com.woorinaru.core.model.base.Identifiable;
import com.woorinaru.core.model.management.administration.Grade;

import java.time.LocalDateTime;
import java.util.List;

public class PushNotification implements Identifiable {
    private int id;
    private String deviceToken;
    private List<Grade> subscribedGrades;
    private LocalDateTime createDateTime;
    private LocalDateTime updateDateTime;

    public PushNotification() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeviceToken() {
        return deviceToken;
    }

    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
    }

    public List<Grade> getSubscribedGrades() {
        return subscribedGrades;
    }

    public void setSubscribedGrades(List<Grade> subscribedGrades) {
        this.subscribedGrades = subscribedGrades;
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
