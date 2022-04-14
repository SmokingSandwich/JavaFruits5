package programmingTasks8.task3_CarpetCalculator;

public class RoomCarpet {

    private double carpetCost = 15;
    private RoomDimension size;

    RoomCarpet(RoomDimension size, double carpetCost) {
        this.size = size;
        this.carpetCost = carpetCost;
    }


    public double getTotalCost() {
        return size.getArea() * carpetCost;
    }

}
