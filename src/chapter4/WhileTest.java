package chapter4;

/**
 * Created by danny on 2017/3/31.
 */
public class WhileTest {
    static  boolean condition(){
        boolean result = Math.random()<0.99;
        System.out.print(result + ",");
        return result;
    }

    public static void main(String[] args) {
        while (condition())
            System.out.println("Inside 'while'");
        System.out.println("Exited 'while'");

    }
}
