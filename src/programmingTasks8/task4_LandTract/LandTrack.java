package programmingTasks8.task4_LandTract;

public class LandTrack {
    private double length;
    private double width;

    LandTrack(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        double area = length * width;
        return area;
    }

    public boolean equals(LandTrack object) {
        boolean status;
        if (getArea() == object.getArea()) {
            status = true;
        } else {
            status = false;
        }
        return status;
    }

    public String toString() {
        return "Object's length is " + length + " and width is " + width;
    }


}
