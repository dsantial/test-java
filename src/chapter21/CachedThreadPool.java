package chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by 390767 on 17-5-27.
 */
public class CachedThreadPool {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i =0 ;i<5 ;i++)
            exec.execute(new LiftOff());
        exec.shutdown();
    }
}
