package edu.monash.fit2099.vehicles;
//Author: Thanh Tung Le
//Last modified: 17/08/2021

import edu.monash.fit2099.bids.Bid;
import edu.monash.fit2099.bids.BidsManager;
import edu.monash.fit2099.buyers.Buyer;

import java.util.*;
abstract public class Vehicle{
    //ArrayList<Bid> bids = new ArrayList<Bid>(); //Create an ArrayList attribute
    BidsManager newBidsManager;
    private String make;
    private String model;
    private int vId;

    Vehicle(String make, String model){
        this.make = make;
        this.model = model;
        this.vId = nextID();
    }

    Vehicle(String make, String model, int vId){
        this.make = make;
        this.model = model;
        this.vId = vId;
    }

    public int nextID(){
        Random r = new Random();
        int low = 10000;//using literal values is not a good idea, replace them with input parameters
        int high = 99999;
        return (r.nextInt(high - low) + low);
    }



    //TASK 3 - Refactor Car’s method names using your IDE’s refactoring tools
    public String description(){
        String output = "Maker: " + make + " " + "and Model: " + model;
        for(int j=0; j<bids.size(); j++){
            output += "\nedu.monash.fit2099.buyers.Buyer and edu.monash.fit2099.bids.Bid's description:\n" + bids.get(j).bidDescription() + "\n";
        }

        return output; //Return a string of the concatenated car maker and model
    }

    //TASK 5 - Adding Bids to Cars
    public void addBid(Buyer newBuyer, int price, String date){
        Bid newBid = new Bid("", date, newBuyer, price);
        newBid.setbidID( Integer.toString( newBid.nextID() ) );
        bids.add(newBid);
    }


}
