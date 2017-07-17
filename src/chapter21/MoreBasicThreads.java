package chapter21;

/**
 * Created by 390767 on 17-5-27.
 */
public class MoreBasicThreads {
    public static void main(String[] args) {
        for (int i=0;i<5;i++)
            new Thread(new LiftOff()).start();
        System.out.println("Waiting for LiftOff");
    }
}
