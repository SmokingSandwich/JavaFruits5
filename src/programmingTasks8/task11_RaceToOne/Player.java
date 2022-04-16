package programmingTasks8.task11_RaceToOne;

import javax.swing.*;

public class Player {
    private int points;
    private String name;
    Dice dice = new Dice();

    Player() {
    }

    Player(String name) {
        this.name = name;
    }

    Player(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public void throwDice() {
        int dicePoints = dice.rollDice();
        points -= dicePoints;
        if (points < 1) {
            points += 2 * dicePoints;
        }
    }

    public int getPoints() {
        return points;
    }

    @Override
    public String toString() {
        return name;
    }

}
