package programmingTasks8.task12_HeadsTails;

public class Main {
    public static void main(String[] args) {

        Player player1 = new Player("Jack", "heads");
        Player player2 = new Player("Ted", "tails");    //Later add the option to choose the betSide by keyboard

        while(true) {
            player1.coinToss();
            player2.coinToss();
            if (player1.getPoints() == 5 && player2.getPoints() == 5) {
                System.out.println("It's a draw !");
                break;
            } else if (player1.getPoints() == 5) {
                System.out.println(player1 + " won");
                break;
            } else if (player2.getPoints() == 5) {
                System.out.println(player2 + " won");
                break;
            }
        }





    }
}
