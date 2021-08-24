package edu.monash.fit2099.buyers;
//Author: Thanh Tung Le
//Last modified: 17/08/2021

//TASK 4 - Create a edu.monash.fit2099.buyers.Buyer and a edu.monash.fit2099.bids.Bid class
public class Buyer{
    private String buyerId;
    private String givenName;
    private String familyName;

    public Buyer(String newBuyerId){
        this.buyerId = newBuyerId;
    }

    public Buyer(String newBuyerId, String newGivenName, String newFamilyName){
        this.buyerId = newBuyerId;
        this.givenName = newGivenName;
        this.familyName = newFamilyName;
    }

    public void setGivenName(String newGivenName){
        this.givenName = newGivenName;
    }

    public void setFamilyName(String newFamilyName){
        this.familyName = newFamilyName;
    }

    public String description(){
        return "edu.monash.fit2099.buyers.Buyer's ID: " + buyerId + " Given Name: " + givenName + " Family Name: " + familyName;
    }
}

//THANK YOU FOR READING AND HAVE A NICE DAY!
