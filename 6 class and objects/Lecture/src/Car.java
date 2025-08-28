//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Car {

        static int noOfCarSold;

        int noOfWheels;
        String color;
        float maxSpeed;
        float currentFuelInLiters;
        int noOfSeats;

        static {
            noOfCarSold =0;
            System.out.println("I am in static block");
        }

        {
            noOfCarSold ++;
            System.out.println("I am in Init block");
         }

        Car(String color){
            this.color = color;
            noOfWheels =4;
            noOfSeats =5;
            maxSpeed =150;
            currentFuelInLiters =2;
        }
        Car(){
             this("black");

    }
        public Car start(){
            if (currentFuelInLiters ==0){
                System.out.println("car is out of fuel, car can not start");
            } else if (currentFuelInLiters <5) {
                System.out.println("car is in reserved mode,please refuel it");
            }else {
                System.out.println("car is started ......bhruhhhhhhh....");

            }
        return this;
        }
        public void drive(){
                currentFuelInLiters--;
                System.out.println("car is driving");


        }
        public void addFuel(float currentFuelInLiters){
//            currentFuelInLiters += currentFuelInLiters;
                this.currentFuelInLiters += currentFuelInLiters;
        }
        public float getCurrentFuelInLevel(){
            return currentFuelInLiters;
        }


}