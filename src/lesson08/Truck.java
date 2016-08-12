package lesson08;

import lesson06.Car;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * Created by punchCleric on 09.08.2016.
 */
public class Truck extends Car {
    public  Truck() {
        System.out.println("hello for Truck");
    }

    public static void main(String[] args) {
       Truck t = new Truck();
    }
}
