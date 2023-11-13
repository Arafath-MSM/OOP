package com;

public class Room implements RoomInterface {
    private int noOfBed;

    @Override
    public int getNoOfBed() {
        return this.noOfBed;
    }

    @Override
    public void setNoOfBed(int noOfBed) {
        this.noOfBed = noOfBed;
    }

    @Override
    public String getBedType() {
        if (noOfBed == 1) {
            return "Single";
        } else if (noOfBed == 2) {
            return "Double";
        } else {
            return "Unknown";
        }
    }

    @Override
    public void setBedType() {
        // No need to implement here
    }

    @Override
    public String toString() {
        return "Room Type: " + getClass().getSimpleName() + "\nNumber of Beds: " + noOfBed + "\nBed Type: " + getBedType();
    }
}
