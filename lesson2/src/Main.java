import java.util.Scanner;

public class Main {

    private static final int FIRST_DOG_AGE = 4; // years
    private static final double FIRST_DOG_HEIGHT = 1.0;
    public static void main(String[] args) {

        Dog myFirstDog = new Dog(FIRST_DOG_AGE, FIRST_DOG_HEIGHT);
        System.out.println("my dog can ran with speed "
                + myFirstDog.getMaxSpeedKmh() + "km/h");

        myFirstDog.doBark(3);
    }

}
