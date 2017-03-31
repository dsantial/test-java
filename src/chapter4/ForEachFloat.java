package chapter4;

/**
 * Created by danny on 2017/3/31.
 */
import java.util.*;
public class ForEachFloat {
    public static void main(String[] args) {
        Random rand = new Random(47);
        float f[] =new  float[10];
        for (int i=0;i<10;i++)
            f[i] = rand.nextFloat();
        for (float x:f)
            System.out.println(x);
    }
}
