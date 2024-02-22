import java.util.ArrayList;

public class Train {

    public Engine myEngine;

    public ArrayList<Car> cars;

    public int nCars;

//Train constructer + initializatizing myEngine + car info
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity) {
        this.myEngine = new Engine(fuelType, fuelCapacity, fuelCapacity);
        this.cars = new ArrayList<Car> (this.nCars);
  
    }
// returns Engine
    public Engine getEngine(){
        return this.myEngine;
    }
// returns car with attributes
    public Car getCar(int i){
        return this.cars.get(i);
    }
// returns max capacity from all cars
    public int getMaxCapacity(){
        int max = 0;

        for (Car car: this.cars){
            max += car.getCapacity(); 
        }
        return max;
    }
// checks the seats remaining
    public int seatsRemaining(){
        int seatsRemaining = 0;

        for (Car car: this.cars){
            seatsRemaining += car.seatsRemaining(); 
        }
        return seatsRemaining();
    }
//  prints the passengers in a car
    public void printManifest(){
        for (Car c:this.cars){
            c.printManifest();
        }


    }
// main function that runs the code

    public static void main(String[] args) {
        Train mytrain = new Train(FuelType.ELECTRIC, 100.0, 20, 30);
        Car car1 = new Car(1);
        Car car2 = new Car(2);
        Car car3 = new Car(3);
        mytrain.cars.add(car1);
        mytrain.cars.add(car2);
        mytrain.cars.add(car3);
        Passenger p = new Passenger("Jo");
        Passenger p1 = new Passenger("Julie");
        Passenger p2 = new Passenger("Olohi");
        car1.addPassenger(p);
        car2.addPassenger(p1);
        car3.addPassenger(p2);
        mytrain.printManifest();

    }

}



