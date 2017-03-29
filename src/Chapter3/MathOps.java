package Chapter3;
import java.util.*;
import net.mindview.util.Print.*;

import static net.mindview.util.Print.print;

/**
 * Created by danny on 2017/3/30.
 */
public class MathOps {
    public static void main(String[] args) {
        //create a seeded number genetatot:
        Random rand = new Random(47);
        int i , j , k;
        //choose  value from 1 to 100
        j = rand.nextInt(100) +1;
        print("j: " + j);
        k = rand.nextInt(100) + 1;
        print("k :" + k);
        i = j + k;
        print("j + k :" + i);
        i = j - k;
        print("j - k:" + i );
        i = j/k;
        print("j/k :" + i);
        i = j * k;
        print("j * k:" + i);
        i = j % k;
        print("j % k :" + i);
        //Floating-point number tests;
        float u , v , w;
        v = rand.nextFloat();
        print("v :" + v);
        w = rand.nextFloat();
        print("w :" + w);
        u = v + w;
        print("v + w :" + u);
        u = v - w;
        print("v - w :" + u);
        u = v * w;
        print("v * w :" + u);
        u = v/w;
        print("v / w :" + u);
        u = v%w;
        print("v % w :" + u);
        //The following also works for char,
        //byte,short,int,long,and double:
        u +=v;
        print("v +=v :" + u);
        u -=v;
        print("u -=v :" + u);
        u *=v;
        print("u *=v :" + u);
        u /=v;
        print("u /=v:" + u);


    }


}
