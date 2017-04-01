package chapter5;

/**
 * Created by danny on 2017/4/1.
 */
import static net.mindview.util.Print.*;
public class InitialValues {
    boolean t;
    char c;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    InitialValues reference;
    void printInitialValues(){
        print("Data type    Initial value");
        print("boolean      " + t);
        print("char         " + c);
        print("byte         " + b);
        print("short         " + s);
        print("int         " + i);
        print("long         " + l);
        print("float         " + f);
        print("double         " + d);

    }

    public static void main(String[] args) {
        InitialValues iv = new InitialValues();
        iv.printInitialValues();
        new InitialValues().printInitialValues();
    }


}
