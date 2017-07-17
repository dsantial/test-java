package chapter21;
import java.util.concurrent.*;
/**
 * Created by 390767 on 17-6-5.
 */
public class EvenChecker implements Runnable {
    private IntGenerator generator;
    private final int id;

    public EvenChecker(IntGenerator g, int ident) {
        generator = g;
        id = ident;
    }

    public void run() {
        while (!generator.isCanceled()) {
            int val = generator.next();
            if (val % 2 != 0) {
                System.out.println(val + "not even!");
                generator.cancel();//Cancels all EvenCh
            }
        }
    }

    public static void test(IntGenerator gp, int count) {
        System.out.println("press Control-C to exit");
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < count; i++)
            exec.execute(new EvenChecker(gp, i));
        exec.shutdown();

    }

    public static void test(IntGenerator gp){
        test(gp,10);
    }

}
