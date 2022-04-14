package programmingTasks8.task3_CarpetCalculator;

public class Main {
    public static void main(String[] args) {

        RoomDimension roomDimension = new RoomDimension(15, 4);

        RoomCarpet roomCarpet = new RoomCarpet(roomDimension, 15);
        System.out.println(roomCarpet.getTotalCost());
    }
}
