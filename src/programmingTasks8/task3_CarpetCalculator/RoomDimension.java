package programmingTasks8.task3_CarpetCalculator;

public class RoomDimension {

    private double lenght;
    private double width;

    public double getArea() {
        double area = lenght  * width;
        return area;
    }

    RoomDimension(double length, double width) {
        this.lenght = length;
        this.width = width;
    }


}
