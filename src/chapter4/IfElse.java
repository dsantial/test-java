package chapter4;
import static net.mindview.util.Print.*;

/**
 * Created by danny on 2017/3/31.
 */
public class IfElse {
    static  int result = 0;
    static void  test (int testval, int target){
        if (testval>target)
            result = +1;
        else if (testval< target)
            result = -1;
        else
            result = 0;
    }

    public static void main(String[] args) {
        test(10,5);
        print(result);
        test(5,10);
        print(result);
        test(5,5);
        print(result);
    }
}
