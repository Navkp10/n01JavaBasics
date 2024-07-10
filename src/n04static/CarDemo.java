package n04static;

public class CarDemo {
    public static void main(String[] args) {
        Car.staticMethod();


        Car myCar = new Car();
        myCar.moving();


        Car navCar = new Car();
        navCar.owner = "Nav";
        navCar.brand = "BMW";
        System.out.println(navCar.owner);
        System.out.println(navCar.brand);

        Car sanCar = new Car ();
        sanCar.owner = "San";
        sanCar.brand = "BMW";

        System.out.println(sanCar.owner);
        System.out.println(sanCar.brand);

        System.out.println(navCar.owner);
        System.out.println(navCar.brand);

        navCar.brand = "BMW1";

        System.out.println("After updating the brand");
        System.out.println(navCar.owner);
        System.out.println(navCar.brand);

        System.out.println(sanCar.owner);
        System.out.println(sanCar.brand);



    }
}
