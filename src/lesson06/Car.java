package lesson06;

/**
 * Created by punchCleric on 09.08.2016.
 */
public class Car {

    private String brand;
    private float rashodOneKm;
    private int runing;
    private int tankCapacity;
    private float ostatokInTank;
    private boolean onOff;

    public Car() {
        System.out.println("hello from Car");
    }

    private Car(String s) {
        System.out.println(s);
    }

    public static Car CarCreator() {
        return new Car("Hello i'm new Car");
    }

    public boolean start() {
        if (ostatokInTank > 0) {
            onOff = true;

            return true;
        }
        return false;
    }

    public void drive(int mils) {
        int startMils = mils;
        if (onOff) {
            while (ostatokInTank > 0 && mils > 0) {
                ostatokInTank -= rashodOneKm;
                mils--;
            }
            if (mils == 0) {
                System.out.println(brand + " проехала: " + startMils);
            } else {
                System.out.println(brand + " Заглохла, но проехала:" + (startMils - mils));
                onOff = false;
            }
            System.out.println("Остаток: " + ostatokInTank);
        } else {
            System.out.println("Машина не заведена!!!");
        }
    }


    public void printAbourMe() {
        System.out.println("Марка автомобиля " + brand +
                "\nРасход " + rashodOneKm +
                "\nПробег " + runing +
                "\nОбем бака " + tankCapacity +
                "\nОстаток топлива " + ostatokInTank +
                "\n");
    }

    public void reFull() {
        System.out.println(brand + " Заправлено на: " + (tankCapacity - ostatokInTank) + " литр");
        ostatokInTank = tankCapacity;

    }

}
