package com;

public class MediumRoom extends Room {
    private boolean hasBalcony;

    public boolean hasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHas Balcony: " + (hasBalcony ? "Yes" : "No");
    }
}
