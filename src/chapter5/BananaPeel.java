package chapter5;

/**
 * Created by danny on 2017/4/1.
 */
class  Banana {
    void peel(int i){/* ... */}

}
public class BananaPeel {
    public static void main(String[] args) {
    Banana a = new Banana(),
            b = new Banana();
    a.peel(1);
    b.peel(2);
    }
}
