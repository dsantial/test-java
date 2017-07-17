package chapter3;

/**
 * Created by danny on 2017/3/31.
 */
public class Casting {
    public static void main(String[] args) {
        int i = 100;
        long lng = (long)i;
        System.out.print(lng);

        lng = i;
        System.out.print(lng);
        long lng2 = (long)200;
        lng2 = 200;
        i = (int)lng2;//Cast required
    }
}
