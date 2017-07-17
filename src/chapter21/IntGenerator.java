package chapter21;

/**
 * Created by 390767 on 17-6-5.
 */
public abstract class IntGenerator {
    private volatile boolean canceled = false;
    public abstract int next();
    //Allow this to be canceles;
    public void cancel(){canceled = true;}
    public boolean isCanceled(){return canceled;}

}
