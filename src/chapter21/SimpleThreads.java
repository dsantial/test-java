package chapter21;

/**
 * Created by 390767 on 17-7-5.
 */

public class SimpleThreads {
    //Display a message ,preceded by the neme of the current thread
    static void threadMessage(String message){
        String threadName = Thread.currentThread().getName();
        System.out.format("%s:%s%n",threadName,message);
    }

    private static class MessageLoop implements Runnable{
        public void run(){
            String importantInfo[]={
                    "Mares eat oats",
                    "Does eat oats",
                    "Little lambs eat ivy",
                    "A kid will eat ivy too"
            };
            try {
                for (int i=0;i<importantInfo.length;i++)
                {
                    Thread.sleep(5000);
                    threadMessage(importantInfo[i]);
                }
            }catch (InterruptedException e){
                threadMessage("I wasn't done !");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        //Delay, in milliseconds before we interrupt MessageLoop thread
        long patience = 1000*60*60;
        //if command line argument present,gives patience in seconds,
        if (args.length>0) {
            try {
                patience = Long.parseLong(args[0]) * 1000;
            } catch (NumberFormatException e) {
                System.err.println("Argment must be an integer.");
                System.exit(1);
            }
        }

        threadMessage("Starting MessageLoop thread ");
        long startTime = System.currentTimeMillis();
        Thread t = new Thread(new MessageLoop());
        t.start();

        threadMessage("Waiting for MessageLoop thread to finish");
        //loop until messageLoop thread exits
        while (t.isAlive()){
            threadMessage("Still waiting...");
            //Wait maximum of 1 second for MessageLoop thread to finish
            t.join(1000);
            if (((System.currentTimeMillis()-startTime)>patience)&&t.isAlive()){
                threadMessage("tired of waiting! ");
                t.interrupt();
                // Should't be long now
                // -- wait indefinitely
                t.join();
            }
        }
        threadMessage("Finally! ");
    }

}
