package programmingTasks8.task8_Mandatesimulator;

import java.lang.invoke.TypeDescriptor;

public class ParkingTicket {
//    private String brand;
//    private String model;
//    private String color;
//    private int number;

    private ParkedCar parkedCar;
    private ParkingMeter parkingMeter;
    private PoliceOfficer policeOfficer;



    ParkingTicket(ParkedCar parkedCar, ParkingMeter parkingMeter, PoliceOfficer policeOfficer) {
        this.parkedCar = parkedCar;
        this.parkingMeter = parkingMeter;
        this.policeOfficer = policeOfficer;

//        this.brand = parkedCar.getBrand();
//        this.model = parkedCar.getModel();
//        this.color = parkedCar.getColor();
//        this.number = parkedCar.getNumber();
    }


    public int amountToPay() {
        int timeBought = parkingMeter.getTimeBought();
        int timeParked = parkedCar.getTimeParked();
        int timeToPay = timeParked - timeBought;
        int overHours = 0;

        if (timeBought < timeParked) {
            if (timeToPay < 60) {
                System.out.println("You have to pay 50 dollars");
                return 50;
            } else if (timeToPay > 60) {
                overHours = timeToPay / 60;
                if (overHours % 60 != 0) {
                    overHours += 1;
                }
                return 50 + (overHours - 1) * 20;
            } else {
                System.out.println("You managed to park out in a bought time !");
                return 0;
            }
        }
        return overHours * 60;
    }


}
