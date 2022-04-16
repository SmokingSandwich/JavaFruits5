package programmingTasks8.task10_FuelGauge;

public class FuelGauge {
    private double fuelLevel = 0;
    private double kilometersTravelled;


    FuelGauge(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }


    public void tank(int litersTanked) {
        fuelLevel += litersTanked;
        if (fuelLevel > 60) {
            System.out.println("Gasoline overflow !");
            fuelLevel = 60;
        }
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void burnedFuel(double liters) {
        fuelLevel -= liters ;
    }

    public double getKilometersTravelled() {
        return kilometersTravelled;
    }

    public void setKilometersTravelled(double kilometersTravelled) {
        this.kilometersTravelled = kilometersTravelled;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }
}
