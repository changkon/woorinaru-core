package com.woorinaru.core.model.user;

public class Student extends User {
    private boolean isGuest;

    public boolean isGuest() {
        return isGuest;
    }

    public void setGuest(boolean guest) {
        isGuest = guest;
    }
}
