public class Driver {


    static  int minAgeForDriving =18;
    String name;
    int age;
    String dateOfLicense;

    public boolean isAllowedForDriving(){
        return this.age>= minAgeForDriving;
    }
    public static void main(String[] args) {
//        Car myCar = new Car();
//        myCar.addFuel(6);
//        myCar.drive();
//        myCar.drive();
//        myCar.drive();
//        myCar.addFuel(6);
//        myCar.drive();
//        System.out.println(myCar.getCurrentFuelInLevel());



        Car swift = new Car( "Red");
        Car thar = new Car( );
//        swift.addFuel(6);
//        Car startedCar = swift.start();
//        startedCar.drive();
        swift.start().drive();
        System.out.println(swift.color);
        System.out.println(thar.color);

//        Driver myDriver = new Driver();
//        myDriver.dateOfLicense = "1/Jan/2025";
//
//        System.out.println(minAgeForDriving);
    }
}
