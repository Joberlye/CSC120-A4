public class Engine {

    private FuelType ft;
    private Double cfl;
    private Double mfl; 


// initalizing attritbutes for Engine class
    public Engine(FuelType ft, Double cfl, Double mfl) {
        this.ft = ft;
        this.cfl = cfl;
        this.mfl = mfl;
    }

//setting fuel to refill to be at max
    private void refuel(){
        this.cfl= this.mfl;
    }

// controls movement of thr train
    private boolean go(){
        this.cfl -= 3;
        System.out.println(this.cfl);

        if(this.cfl <= 0){
            return false;
        }
        else{
            return true;
        }
        }


// makes the train move
        public static void main(String[] args) {
            Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0, 200.0);
            while (myEngine.go()) {
                // when it returns true
                System.out.println("Choo choo!");
            }
            // when it returns false
            System.out.println("Out of fuel.");
        }
    }

