package edu.monash.fit2099.vehicles;
//Author: Thanh Tung Le
//Last modified: 24/08/2021

import edu.monash.fit2099.vehicles.Vehicle;

//TASK 1 - Support for multiple types of vehicles
public class Sedan extends Vehicle {
    int seats;

    public Sedan(String make, String model, int seats){
        super(make, model);
        this.seats = seats;
    }

    public Sedan(String make, String model, int vId, int seats){
        super(make, model, vId);
        this.seats = seats;
    }
}
