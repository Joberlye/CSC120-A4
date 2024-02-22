public class Passenger {
    
    public String name; //changed to public

    public Passenger(String name){
        this.name = name;
    }

// doesn't allow passenger to board car if its full
public void boardCar(Car c){
    if (c.addPassenger(this) == false ) {
        System.out.println("Sorry, this car is full.");
    }

}

// removes passenger from car if its full, tells them to go to another
public void getOffCar(Car c){
    if (c.removePassenger(this) == false ) {
        System.out.println("Sorry, try the next car.");
    }

}

// assigns names to passenger
public static void main(String[] args) {
    Passenger person = new Passenger ("Julie");
    Passenger person1 = new Passenger ("Jo");
    Passenger person2 = new Passenger("Olohi");

}
}