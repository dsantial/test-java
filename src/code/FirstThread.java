package code;

/**
 * Created by 390767 on 17-5-22.
 */
public class FirstThread extends Thread {
    private int i;

    @Override
    public void run() {
        for (;i<10;i++)
        {
            System.out.println(getName() + "\t" + i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0;i<10 ;i++)
        {
            System.out.println(Thread.currentThread().getName() + "\t"+ i);
            if (i==5)
            {
                FirstThread f1 = new FirstThread();
                FirstThread f2 = new FirstThread();
                f1.start();
                f2.start();
            }
        }
    }
}
