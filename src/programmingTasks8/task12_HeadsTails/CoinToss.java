package programmingTasks8.task12_HeadsTails;

import java.util.Random;

public class CoinToss {
    Random rand = new Random();

    private String sideUp;


    CoinToss() {
    }

    // Heads or tails - orzeł czy reszka

//    public void runner() {
//        for (int i = 0; i < 20; i++) {
//            tossCoin();
//            System.out.println(getSideUp());
//        }
//        System.out.println("The number of heads thrown is equal to: " + tailsCounter);
//        System.out.println("The number of tails thrown is equal to: " + headsCounter);
//
//    }

    public String tossCoin() {
        int result = rand.nextInt(2);
        if (result == 0) {
            sideUp = "heads";
        } else {
            sideUp = "tails";
        }
        return sideUp;
    }

    public String getSideUp() {
        return sideUp;
    }

    public void setSideUp(String sideUp) {
        this.sideUp = sideUp;
    }
}
