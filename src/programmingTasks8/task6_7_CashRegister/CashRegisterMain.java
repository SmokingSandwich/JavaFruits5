package programmingTasks8.task6_7_CashRegister;

import java.util.Scanner;

public class CashRegisterMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfItems;

        Retail retail = new Retail("Shirt", 35, 15);
        CashRegister cashRegister = new CashRegister(retail);

        System.out.println("Number of units available: " + cashRegister.getNumberOfItems());

        System.out.println("Please enter the quantity of items you want to buy");
        numberOfItems = scan.nextInt();
        cashRegister.sell(numberOfItems);

        System.out.println("Number of units available: " + cashRegister.getNumberOfItems());

        System.out.println("The price per piece is equal to: " + cashRegister.getPrice());
        System.out.println("Cost netto: " + cashRegister.getSubTotal());
        System.out.println("Tax: " + cashRegister.getTax());
        System.out.println("Cost brutto: " + cashRegister.getTotal());






    }
}
