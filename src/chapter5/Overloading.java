package chapter5;

/**
 * Created by danny on 2017/3/31.
 */
import net.mindview.util.Print;
import net.mindview.util.Print.*;

import static net.mindview.util.Print.print;

class  Tree{
    int height;
    Tree(){
        print("Planting a seedling");
        height = 0;
    }
    Tree(int initialheight){
        height = initialheight;
        print("Creating new Tree that is " +
        height + "feet tall");
    }
    void info(String s){
    print(s + ": Tree is " + height + "feet tall");
        }
    void  info() {
            print("Tree is "+ height + "feet tall") ;
    }
}
public class Overloading {
    public static void main(String[] args) {
        for (int i = 0;i<4 ;i++)
        {
            Tree t = new Tree(i);
            t.info();
            t.info("overloaded method");
        }
        new Tree();
    }

}
