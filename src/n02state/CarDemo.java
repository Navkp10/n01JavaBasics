package n02state;

public class CarDemo {
    public static void main(String[] args) {
        car mycar = new car ();
        mycar.moving();

        car navcar = new car ();
        navcar.owner = "Nav";
        navcar.speed = 100;
        System.out.println(navcar.owner);
        System.out.println(navcar.speed);

    }
}
