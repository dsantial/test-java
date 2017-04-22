package code;

/**
 * Created by 390767 on 17-4-21.
 */
abstract class AA{
    abstract void methodA();
}

abstract class BB{
    abstract void methodB();
}

class CC extends AA{
    @Override
    void methodA(){
        System.out.println("extends A's method ");
    }
    BB getB(){
        return new BB() {
            @Override
            void methodB() {
                System.out.println("extends B's method");
            }
        };
    }
}
public class MultiImplementation {
    public void doA(AA a){
        a.methodA();
    }

    public void doB(BB b){
        b.methodB();
    }

    public static void main(String[] args) {
        MultiImplementation mi = new MultiImplementation();
        CC c = new CC();
        mi.doA(c);
        mi.doB(c.getB());
    }
}
