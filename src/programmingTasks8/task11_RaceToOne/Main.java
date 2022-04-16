package programmingTasks8.task11_RaceToOne;

public class Main {
    public static void main(String[] args) {

        Player player1 = new Player("Jack", 20);
        Player player2 = new Player("Johnny", 20);

        while (player1.getPoints() != 1 || player2.getPoints() != 1) {  //Add a delay to this in order to keep track of the game
            player1.throwDice();
            player2.throwDice();
            System.out.println("Player 1 points: " + player1.getPoints());
            System.out.println("Player 2 points: " + player2.getPoints());

            if (player1.getPoints() == 1 && player2.getPoints() == 1) {
                System.out.println("It's a draw !");
                break;
            } else if (player1.getPoints() == 1) {
                System.out.println(player1 + " won !");
                break;
            } else if (player2.getPoints() == 1) {
                System.out.println(player2 + " won !");
                break;
            }
            try {
                Thread.sleep(1400);
            } catch (InterruptedException e) {
                System.out.println("Something went wrong with the thread");
            }
        }
    }
}
