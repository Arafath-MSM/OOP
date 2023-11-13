package com;

public class CreateRoom {
    public static void main(String[] args) {
        // Create instances of SmallRoom and MediumRoom
        SmallRoom smallRoom = new SmallRoom();
        smallRoom.setNoOfBed(1);

        MediumRoom mediumRoom = new MediumRoom();
        mediumRoom.setNoOfBed(2);
        mediumRoom.setHasBalcony(true);

        // Print the features of the rooms using toString() method
        System.out.println("Small Room:\n" + smallRoom);
        System.out.println("\nMedium Room:\n" + mediumRoom);
    }
}
