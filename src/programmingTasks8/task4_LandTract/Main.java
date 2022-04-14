package programmingTasks8.task4_LandTract;

public class Main {
    public static void main(String[] args) {

        LandTrack landTrack = new LandTrack(15, 10);
        LandTrack landTrack2 = new LandTrack(10, 15);

        System.out.println(landTrack.getArea());
        System.out.println(landTrack.equals(landTrack2));
        System.out.println(landTrack);



    }
}
