package chapter5;

/**
 * Created by danny on 2017/4/1.
 */
import java.util.*;
import static net.mindview.util.Print.*;
public class ArrayClassObj {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Integer[] a = new Integer[rand.nextInt(20)];
        print("length of a = " + a.length);
        for (int i=0;i < a.length;i++)
            a[i] =rand.nextInt(500);
        print(Arrays.toString(a));
    }

}
