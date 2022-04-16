package programmingTasks8.task12_HeadsTails;

public class Player {

    private final String name;
    private int points = 0;
    private final CoinToss coinToss = new CoinToss();
    private String sideUp;
    private final String sideBet;   //The IDE suggested for it to be final



    Player(String name, String sideBet) {
        this.name = name;
        this.sideBet = sideBet;
    }

    public void coinToss() {
        sideUp = coinToss.tossCoin();
        checkResult();
    }

    public void checkResult() {
        if (sideUp.equalsIgnoreCase(sideBet)) {
            System.out.println(name + " guessed correctly !" );     // Override the toString method later
            points++;
        } else {
            System.out.println(name + " chose poorly");
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
