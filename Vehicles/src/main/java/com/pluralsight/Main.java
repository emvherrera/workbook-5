package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        //Car
        Car car = new Car();
        car.isConvertible();// Unique to Car Class
        car.getDriveType(); // Unique to Car Class
        car.getColor(); // Taken from parent class, 'Vehicle'

        //SemiTruck
        SemiTruck semiTruck = new SemiTruck();
        semiTruck.getTrailerType();// Unique to SemiTruck
        semiTruck.isSleepingCab(); // Unique to SemiTruck
        semiTruck.getColor(); // Taken from parent class, 'Vehicle'

        //Hovercraft
        Hovercraft hovercraft = new Hovercraft();
        hovercraft.isStabilitySystem(); // Unique to Hovercraft class
        hovercraft.isSurfaceTypeSupported(); // Unique to Hovercraft class
        hovercraft.getColor(); // Taken from parent class, 'Vehicle'

        //Moped
        Moped moped = new Moped();
        moped.getScooterStyle(); // Unique to Moped class
        moped.isHelmetStorage(); // Unique to Moped class
        moped.getColor(); // Take from parent class, 'Vehicle;





    }

}

