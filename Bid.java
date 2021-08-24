package edu.monash.fit2099.bids;
//Author: Thanh Tung Le
//Last modified: 17/08/2021

//TASK 4 - Create a edu.monash.fit2099.buyers.Buyer and a edu.monash.fit2099.bids.Bid class
import edu.monash.fit2099.buyers.Buyer;

import java.util.*;
public class Bid{
    private String bidID;
    private int priceBid;
    Buyer newInstance;
    private String DOB; //DOB means date of bid

    public Bid(String bidID, String DOB, Buyer newInstance, int priceBid){
        this.bidID = bidID;
        this.DOB = DOB;
        this.priceBid = priceBid;
        this.newInstance = newInstance;
    }

    //Getters and setters for each parameter in edu.monash.fit2099.bids.Bid (like the question said)
    public String getbidID(){
        return bidID;
    }

    public void setbidID(String bidID){
        this.bidID = bidID;
    }

    public int getpriceBid(){
        return priceBid;
    }

    public void setpriceBid(int priceBid){
        this.priceBid = priceBid;
    }

    public String getDOB(){
        return DOB;
    }

    public void setDOB(String DOB){
        this.DOB = DOB;
    }

    public Buyer getnewInstance(){
        return newInstance;
    }

    public void setnewInstance(Buyer newInstnace){
        this.newInstance = newInstance;
    }

    public int nextID(){
        Random r = new Random();
        int low = 10000;
        int high = 99999;
        return (r.nextInt(high - low) + low);
    }

    //Method for edu.monash.fit2099.bids.Bid's description
    public String bidDescription(){
        return "edu.monash.fit2099.bids.Bid's ID: " + bidID + "\nedu.monash.fit2099.bids.Bid's date: " + DOB + "\nedu.monash.fit2099.bids.Bid's price: " + priceBid + "\nedu.monash.fit2099.buyers.Buyer's description: (details down below) \n" + newInstance.description();
    }
}

//THANK YOU FOR READING AND HAVE A NICE DAY!
