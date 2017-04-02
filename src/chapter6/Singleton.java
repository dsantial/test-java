package chapter6;

/**
 * Created by danny on 2017/4/2.
 */
public class Singleton {
    private Singleton(){
        System.out.println("Singleton is create");
    }
    private static Singleton instance = new Singleton();
    public static Singleton getInstance(){
        return instance;
    }
    public static void createString(){
        System.out.println("createString in Singleton");

    }

    public static void main(String[] args) {
        Singleton.getInstance();
    }
}
