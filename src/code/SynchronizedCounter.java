package code;

/**
 * Created by 390767 on 17-7-5.
 */
public class SynchronizedCounter {
    private int c=0;

    public   void increment(){c++;}

    public   void decrement(){c--;}

    public   int value(){return c;}

    public static void main(String[] args) {
      SynchronizedCounter fd =  new SynchronizedCounter();
      fd.decrement(); fd.increment();
        System.out.println(fd.c);

        System.out.println(fd.c);
    }

}
