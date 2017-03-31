package Chapter3;
import static net.mindview.util.Print.*;
/**
 * Created by danny on 2017/3/31.
 */
public class StringOperators {
    public static void main(String[] args) {
        int x = 0 ,y = 1,z = 2;
        String s = "x , y , z";
        print(s + x + y + z);
        print(x + " " + s);//converts x to string
        s +="(summed) = ";
        print(s + (x + y + z));
        print("" + x);




    }
}
