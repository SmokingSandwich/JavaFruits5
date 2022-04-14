package programmingTasks8.task5_Month;

public class Main {
    public static void main(String[] args) {

        Month month1 = new Month();

        Month month2 = new Month(5);

        Month month3 = new Month(15);

        Month month4 = new Month("March");

        System.out.println(month1);
        System.out.println(month2);
        System.out.println(month3);
        System.out.println(month4);

        System.out.println(month1.greaterThan(month2));
        System.out.println(month1.lessThan(month4));
        System.out.println(month1.equals(month3));

        month4.setMonthNumber(9);
        System.out.println(month4);

    }
}
