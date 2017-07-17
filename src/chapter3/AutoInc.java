package chapter3;

import static net.mindview.util.Print.print;

/**
 * Created by danny on 2017/3/30.
 */
//demonstrates the ++ and -- operators.
public class AutoInc {
    public static void main(String[] args){
        int i = 1;
        print("i : " + i);
        print("++i : " + ++i);
        print("i++ : " + i++);
        print("i : " + i);
        print("i-- : " + i--);
        print("--i : " + --i);
        print("i : " + i);

    }
}
