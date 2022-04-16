package programmingTasks8.task11_RaceToOne;

import java.util.Random;

public class Dice {
    Random rand = new Random();
    private int numberThrown;
    private int points = 0;


    Dice() {
        rollDice();
    }

    public void addPoint() {
        points += 1;
    }

    public int getPoints() {
        return points;
    }

    public int rollDice() {
        numberThrown = rand.nextInt(6) + 1;
        return numberThrown;
    }

    public int getNumberThrown() {
        return numberThrown;
    }


}
