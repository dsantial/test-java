package chapter5;

/**
 * Created by danny on 2017/4/2.
 */
public class VarargType {
    static void f(Character... arge){
        System.out.print(arge.getClass());
        System.out.println(" length " + arge.length);
    }
    static void g(int... args){
        System.out.print(args.getClass());
        System.out.print(" length " + args.length);
    }

    public static void main(String[] args) {
        f('a');
        f();
        g(1);
        g();
        System.out.println(" int[]: " + new int[0].getClass());
    }
}
