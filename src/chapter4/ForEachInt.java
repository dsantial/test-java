package chapter4;

/**
 * Created by danny on 2017/3/31.
 */
import static net.mindview.util.Range.*;
import static net.mindview.util.Print.*;


public class ForEachInt {
    public static void main(String[] args) {
        for (int i : range(10))
            printnb(i + " " );
        print();
        for (int i:range(5,10))
            printnb(i + " ");
        print();
        for (int i:range(5,20,3))
            printnb(i + " ");
        print();

    }
}
