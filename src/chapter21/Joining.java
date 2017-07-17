package chapter21;

/**
 * Created by 390767 on 17-7-3.
 */
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.core.config.Property;

import static net.mindview.util.Print.*;

class Sleeper extends Thread{
    private int duration;
    public Sleeper (String name,int sleepTime){
        super(name);
        duration = sleepTime;
        start();
    }
    public void run(){
        try {
            sleep(duration);
        }catch (InterruptedException e){
            print(getName() + " was interrupted. " +
            " isInterrupted(): " + isInterrupted());
            return;
        }
        print(getName()+ "has aeakended");
    }
}
 class Joiner extends Thread{
    private  Sleeper sleeper;
    public Joiner(String name,Sleeper sleeper){
        super(name);
        this.sleeper  =sleeper;
        start();
    }
    public void run(){
        try {
            sleeper.join();
        }catch (InterruptedException e){
            print("Interrupted");
        }
        print(getName() + " join completed");
    }
}
public class  Joining{
    static Logger logger = Logger.getLogger("file");
     public static void main(String[] args) {


//         PropertyConfigurator.configure("src/resources/log4j.properties");

        Sleeper
                sleepy=new Sleeper("Sleepy",1500),
                grumpy =new Sleeper("Grumpy",1500);
        logger.error("It is a warnning message!");
        Joiner
                dopey = new Joiner("Dopey",sleepy),
                doc = new Joiner("Doc",grumpy);
        logger.error("Just a test message!");
        grumpy.interrupt();
    }
}

