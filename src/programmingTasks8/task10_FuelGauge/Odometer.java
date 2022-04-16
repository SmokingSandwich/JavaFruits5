package programmingTasks8.task10_FuelGauge;

public class Odometer {
    private int odoMeterCount;
    FuelGauge fuelGauge;
    double litersBurned;


    Odometer(int odoMeterCount, FuelGauge fuelGauge){
        this.odoMeterCount = odoMeterCount;
        this.fuelGauge = fuelGauge;
    }

    public void drive(double kilometersTravelled) {
        this.odoMeterCount += kilometersTravelled;

        litersBurned = kilometersTravelled / 20;
        System.out.println("You car travelled " + kilometersTravelled + " kilometers and burned " + litersBurned + " liters of fuel");
        fuelGauge.burnedFuel(litersBurned);
        if (fuelGauge.getFuelLevel() < 0) {
            System.out.println("Your car run out of fuel !");
            fuelGauge.setFuelLevel(0);
        }
    }

    public int getOdoMeterCount() {
        return odoMeterCount;
    }

    public double getFuelLevel(){
        return fuelGauge.getFuelLevel();
    }



}
