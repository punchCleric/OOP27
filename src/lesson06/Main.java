package lesson06;

/**
 * Created by punchCleric on 09.08.2016.
 */
public class Main {
    public static void main(String[] args) {

        Car.CarCreator();

        Car car1 = Car.CarCreator();

        Car car2 = new Car();

        Car car3 = new Car();


        car1.printAbourMe();
        car2.printAbourMe();
        car3.printAbourMe();

        car1.reFull();
        car1.drive(110);

    }
}
