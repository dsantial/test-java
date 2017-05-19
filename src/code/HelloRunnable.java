package code;

/**
 * Created by 390767 on 17-5-16.
 */
public class HelloRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello from a thread");
    }

    public static void main(String[] args) {
        (new Thread(new HelloRunnable())).start();
    }
}
