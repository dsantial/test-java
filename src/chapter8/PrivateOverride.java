package chapter8;

/**
 * Created by danny on 2017/4/4.
 */
import static net.mindview.util.Print.*;

public class PrivateOverride {
    private void f(){
        print("privite f()");
    }

    public static void main(String[] args) {
        PrivateOverride po = new PrivateOverride();
        po.f();
    }
}
class Deriver extends PrivateOverride{
    public void f(){print("public f()");}
}

