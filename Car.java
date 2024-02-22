import java.util.ArrayList;



public class Car {
// creates a list of Passengers
    private ArrayList<Passenger> passengers;

    private int max; 

// constructor car: sets attributes for Car class
    public Car(int max) {
        this.max = max;
        this.passengers = new ArrayList<Passenger> (max);
    }
 
    // return the maximum capacity
    public int getCapacity() {
        return this.max;
    }
    // return the remaining seats, respectively
    public int seatsRemaining(){
        int seats = getCapacity();
        int occupied =  passengers.size();
        int seatsLeft = seats - occupied;
        System.out.println(seatsLeft);
        return seatsLeft;
    }


// denys any Passengers that wants to be added if the car is at max
    public boolean addPassenger(Passenger p){
        if (this.passengers.size() == this.max){
            System.out.println("This is at max capacity");
            return false;
        }

        else if (this.passengers.contains(p)) {
            System.out.println("This passenger is already here");
            return false;
        }

        this.passengers.add (p);
        System.out.println("This passenger has been added");
        return true;

    }
    // denys any Passengers that wants to be removed if the car is at max
    public boolean removePassenger(Passenger p){
        if (this.passengers.size() == this.max){
            System.out.println("This is at max capacity");
            return false;
        }

        else if (this.passengers.contains(p)) {
            System.out.println("This passenger is already here");
            return false;
        }

        this.passengers.remove (p);
        System.out.println("This passenger has been removed");
        return true;


    }

// prints passenger's in the car
    public void printManifest(){
        if (this.passengers.size() == 0){
            System.out.println("This car is Empty");
        }

        else{
            for (int i= 0; i< this.passengers.size(); i ++){
            System.out.println(this.passengers.get(i).name);}
            //passengers. [accessor for names of passengers]
        }

    }



// main function that runs the code

public static void main(String[] args) {
    Car one = new Car(3);
    one.getCapacity();

     Passenger p = new Passenger ("Julie");
     Passenger p1 = new Passenger ("Jo");
     Passenger p2 = new Passenger ("Olohi");

     one.addPassenger(p);
     one.addPassenger(p1);
     one.addPassenger(p2);
     one.printManifest();

 } 


}

