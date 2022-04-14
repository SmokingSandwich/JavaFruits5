package programmingTasks8.task1_AreaClass;

public class AreaClass {

    static double area;

    public static double calculateArea(double radius) {
        area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    public static double calculateArea(int width, int height) {
        area = width * height;
        return area;
    }

    public static double calculateArea(double radius, double height2) {
        area = Math.PI * Math.pow(radius, 2) * height2;
        return area;
    }


    public static void main(String[] args) {
        System.out.println(calculateArea(5));
        System.out.println(calculateArea(15, 14));
        System.out.println(calculateArea(15, 13.3));
    }


}
