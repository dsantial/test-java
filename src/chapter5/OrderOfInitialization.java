package chapter5;

/**
 * Created by danny on 2017/4/1.
 */
import static net.mindview.util.Print.*;

class Window {
    Window(int market){
        print("Window (" +market + ")");
    }
}
class  House {
    Window w1 = new Window(1);
    House(){
        print("House() ");
        w3 = new Window(33);
    }
    Window w2 = new Window(2);
    void f(){print("f()");}
    Window w3 = new Window(3);
    }
public class OrderOfInitialization {
    public static void main(String[] args) {
        House h = new House();
        h.f();
    }


}
