public class Dog {
    private final int MAX_SPEED_KMH_FAST = 25;
    private final int MAX_SPEED_KMH_SLOW = 13;
    private int age;
    private double height_in_m;

    public int getMaxSpeedKmh() {
        if (age < 3 && height_in_m < 0.4) {
            return MAX_SPEED_KMH_SLOW;
        } else {
            return MAX_SPEED_KMH_FAST;
        }
    }

    public Dog(int age, double height_in_m) {
        this.age = age;
        this.height_in_m = height_in_m;
    }

    public boolean doBark(int times) {

        for (int i = 0; i < times; i++) {
            if (age > 2) System.out.println("BARK!!!");
            else System.out.println("bark...");
        }

        return true;
    }
}
