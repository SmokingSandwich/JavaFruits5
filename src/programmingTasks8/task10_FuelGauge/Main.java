package programmingTasks8.task10_FuelGauge;

public class Main {
    public static void main(String[] args) {

        Odometer odometer = new Odometer(100000 ,new FuelGauge(30));

        odometer.drive(105);
        System.out.println("The odometer counter shows: " + odometer.getOdoMeterCount());
        System.out.println(odometer.getFuelLevel());
        odometer.fuelGauge.tank(50);

        System.out.println(odometer.getFuelLevel());
        odometer.drive(300);
        System.out.println(odometer.getFuelLevel());
        System.out.println("The odometer counter shows: " + odometer.getOdoMeterCount());
        odometer.drive(1000);


    }
}
