package programmingTasks8.task6_CashRegister;

public class CashRegister {
    private int numberOfItems;
    private int numberOfSold;
    private double price;


    public void sell(int numberOfSold) {
        this.numberOfSold = numberOfSold;
        if (numberOfItems - numberOfSold >= 0) {
            numberOfItems -= numberOfSold;
        } else {
            this.numberOfSold = numberOfItems;
            numberOfItems = 0;
            System.out.println("We don't have that many items in stock !");
            System.out.println("Number of items sold: " + this.numberOfSold);
        }
    }


    public double getSubTotal() {
        return numberOfSold * price;
    }

    public double getTax() {
        return getSubTotal() * 0.23;
    }


    public double getTotal() {
        return getSubTotal() + getTax();
    }


    CashRegister(Retail object) {
        this.price = object.getPrice();
        numberOfItems = object.getUnitsOnHand();
    }

    public double getPrice() {
        return price;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }


}
