//Author: Thanh Tung Le
//Last modified: 17/08/2021

import edu.monash.fit2099.bids.Bid;
import edu.monash.fit2099.buyers.Buyer;
import edu.monash.fit2099.vehicles.Sedan;
import edu.monash.fit2099.vehicles.Truck;
import edu.monash.fit2099.vehicles.Vehicle;

import java.util.*;
public class AutoShowroom{
    public void printStatus(){
        System.out.println("Welcome to FIT2099 Showroom");
        createCars();
        displayCars();
        System.out.println("Thank you for visiting FIT2099 Showroom");
    }

    ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>(); //Create an ArrayList object to store the collection of Cars
    ArrayList<Buyer> buyers = new ArrayList<Buyer>(); //Create an ArrayList object to store the collection of Buyers
    public void createCars(){
        for(int i=0; i<3; i++){
            Scanner myObj = new Scanner(System.in); //Create a Scanner object
            System.out.print("Make: ");
            String make = myObj.nextLine();
            System.out.print("Model: ");
            String model = myObj.nextLine();
            System.out.print("edu.monash.fit2099.buyers.Buyer's ID: ");
            String ID = myObj.nextLine();
            System.out.print("edu.monash.fit2099.buyers.Buyer's Given Name: ");
            String givenName = myObj.nextLine();
            System.out.print("edu.monash.fit2099.buyers.Buyer's Family Name: ");
            String familyName = myObj.nextLine();
            System.out.print("edu.monash.fit2099.buyers.Buyer's Date (Please enter the date in this format DD/MM/YYYY) : ");
            String date = myObj.nextLine();
            System.out.print("edu.monash.fit2099.buyers.Buyer's Price: ");
            int price = myObj.nextInt();
            System.out.print("\n");

            Buyer buyerObj = new Buyer(ID, givenName, familyName);
            vehicles.add(new Vehicle(make, model));
            vehicles.get(i).addBid(buyerObj, price, date);
        }
    }

    public void displayCars(){
        for(int i = 0; i< vehicles.size(); i++){
            System.out.println(vehicles.get(i).description());
        }
    }

    //TASK 3 - Group classes using packages.
    //TASK 4 - Update AutoShowroom Class
    public void createSedan(){
        Scanner myObj = new Scanner(System.in); //Create a Scanner object
        System.out.print("Make: ");
        String make = myObj.nextLine();
        System.out.print("Model: ");
        String model = myObj.nextLine();
        System.out.print("Seats: ");
        int seats = myObj.nextInt();
        Sedan newSedan = new Sedan(make, model, seats);
        vehicles.add(newSedan);
    }

    public void createTruck(){
        Scanner myObj = new Scanner(System.in); //Create a Scanner object
        System.out.print("Make: ");
        String make = myObj.nextLine();
        System.out.print("Model: ");
        String model = myObj.nextLine();
        System.out.print("Capacity: ");
        int capacity = myObj.nextInt();
        System.out.print("Wheels: ");
        int wheels = myObj.nextInt();
        Truck newTruck = new Truck(make, model, capacity, wheels);
        vehicles.add(newTruck);
    }

    public void createBuyer(){
        Scanner myObj = new Scanner(System.in); //Create a Scanner object
        System.out.print("Buyer ID: ");
        String newBuyerId = myObj.nextLine();
        System.out.print("Given Name: ");
        String newGivenName = myObj.nextLine();
        System.out.print("Family Name: ");
        String newFamilyName = myObj.nextLine();
        Buyer newBuyer = new Buyer(newBuyerId, newGivenName, newFamilyName);
        buyers.add(newBuyer);

    }

    public void createBid(){
        Scanner myObj = new Scanner(System.in); //Create a Scanner object
        System.out.print("Buyer ID: ");
        String buyerID = myObj.nextLine();
        System.out.print("Vehicle ID: ");
        String vehicleID = myObj.nextLine();
        System.out.print("Date of Bid: ");
        String DOB = myObj.nextLine();
        System.out.print("Price of Bid: ");
        int priceBid = myObj.nextInt();
        Buyer buyer = new Buyer(buyerID, givenName, fa)
        Bid newBid = new Bid(bidID, DOB, buyer, priceBid);

    }

    public void displayFeet(){

    }

    public void displayBuyers(){

    }
}

