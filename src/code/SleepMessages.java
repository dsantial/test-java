package code;

/**
 * Created by 390767 on 17-5-16.
 */
public class SleepMessages  {

    public static void main(String[] args) throws InterruptedException {
        String importantInfo[] ={"mares eat oats","Does eat oats ", "Little lambs eat ivy","A kid will eat ivy too"};
        for (int i = 0;i< importantInfo.length;i++){
           try {
               Thread.sleep(4000);
           } catch (InterruptedException e){
               return;
           }

            System.out.println(importantInfo[i]);
        }

    }
}
