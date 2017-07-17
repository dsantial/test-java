package chapter3;
import java.util.*;
import static net.mindview.util.Print.*;

/**
 * Created by danny on 2017/3/30.
 */
public class Bool {
    public static void main(String[] args) {
        Random rand = new Random(47);
        int i = rand.nextInt(100);
        int j = rand.nextInt(100);
        print("i = " + i);
        print("j = " + j);
        print(" i > j is " + (i > j));
        print(" i < j is " + (i < j));
        print(" i >= j is " + (i >= j));
        print(" i =< j is " + (i <= j));
        print(" i == j is " + (i == j));
        print(" i != j is " + (i != j));


        long currentTime = System.nanoTime();
        print(currentTime);
    }
}
