package programmingTasks8.task9_GeometricCalculator;

import java.util.Scanner;

public class Geometry {
    Scanner scan = new Scanner(System.in);

    public static double circleArea(double radius) {
        if (radius < 0) {
            System.out.println("You can't put in a negative value !");
            return 0;
        }
        return Math.PI * Math.pow(radius, 2);
    }

    public static double rectangleArea(double width, double length) {
        if (width < 0 || length < 0) {
            System.out.println("You can't put in a negative value !");
            return 0;
        }
        return width * length;
    }

    public static double triangleArea(double base, double height) {
        if (base < 0 || height < 0) {
            System.out.println("You can't put in a negative value !");
            return 0;
        }
        return base * height * 0.5;
    }

    public void showMenu() {
        int choose;
        do {
            System.out.println("1) Circle area");
            System.out.println("2) Rectangle area");
            System.out.println("3) Triangle area");
            System.out.println("4) The end");

            choose = scan.nextInt();

            switch (choose) {       //Enhanced switch which doesn't require breaks
                case 1 -> {
                    System.out.println("Enter the radius of the circle");
                    double radius = scan.nextDouble();
                    System.out.println(circleArea(radius));
                }
                case 2 -> {
                    System.out.println("Please enter the width of a rectangle");
                    double width = scan.nextDouble();
                    System.out.println("Please enter the length of a rectangle");
                    double length = scan.nextDouble();
                    System.out.println(rectangleArea(width, length));
                }
                case 3 -> {
                    System.out.println("Enter the base of a triangle");
                    double base = scan.nextDouble();
                    System.out.println("Enter the height of a triangle");
                    double height = scan.nextDouble();
                    System.out.println(triangleArea(base, height));
                }
                case 4 -> {
                    System.out.println("The end of the program");       //TODO the end doesn't work in a while true loop
                    break;
                }
            }
        } while (choose != 4);
    }

}