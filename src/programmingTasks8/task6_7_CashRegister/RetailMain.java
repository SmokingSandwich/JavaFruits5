package programmingTasks8.task6_7_CashRegister;

public class RetailMain {
    public static void main(String[] args) {


        Retail retail1 = new Retail("Jacket", 15, 161.2) {
        };

        Retail retail2 = new Retail("Jeans", 40, 134.95);

        Retail retail3 = new Retail("Shirt", 20, 124.95);

        System.out.println(retail1.getDescription());
        System.out.println(retail1.getUnitsOnHand());
        System.out.println(retail1.getPrice());

    }
}
