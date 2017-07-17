package chapter11;

/**
 * Created by 390767 on 17-4-27.
 */
import java.util.*;

class Apple {
    private static long counter;
    private final long id = counter++;
    public long id(){return id;}

}

class Orange{}

public class ApplesAndOrangesWithoutGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        for (int i= 0;i<3;i++)
            apples.add(new Apple());
        //not prevented from adding an Orang to apples;
        apples.add(new Orange());
        for (int i =0 ;i<apples.size();i++)
            ((Apple)apples.get(i)).id();
        //Orange is detected only at run time

    }
}
