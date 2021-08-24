package edu.monash.fit2099.bids;
//Author: Thanh Tung Le
//Last modified: 24/08/2021

import edu.monash.fit2099.buyers.Buyer;

import java.util.*;
public class BidsManager{
    HashMap<String, Bid> hashMap;

    public BidsManager(){
        hashMap = new HashMap<String, Bid>();
    }

    public void addBid(String buyerId, int bidPrice, String bidDate){
        Buyer newBuyer = new Buyer(buyerId);
        Bid newBid = new Bid("", bidDate, newBuyer, bidPrice);
        newBid.setbidID( Integer.toString( newBid.nextID() ) );
        hashMap.put(buyerId, newBid);
    }


}
