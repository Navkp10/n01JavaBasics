package n01basics;

public class CarDemo {
    public static void main(String[] args) {
      Car myCar = new Car ();
      myCar.moving();
      myCar.method2();
        System.out.println(myCar.speed);
        System.out.println(myCar.color);
        System.out.println(myCar.owner);

        System.out.println(new Car());

    }
}
