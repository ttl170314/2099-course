package edu.monash.fit2099.vehicles;
//Author: Thanh Tung Le
//Last modified: 24/08/2021

import edu.monash.fit2099.vehicles.Vehicle;

//TASK 1 - Support for multiple types of vehicles
public class Truck extends Vehicle {
    int capacity;
    int wheels;

    public Truck(String make, String model, int capacity, int wheels){
        super(make, model);
        this.capacity = capacity;
        this.wheels = wheels;
    }

    public Truck(String make, String model, int vId, int capacity, int wheels){
        super(make, model, vId);
        this.capacity = capacity;
        this.wheels = wheels;
    }
}


