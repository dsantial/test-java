package Chapter7;

/**
 * Created by danny on 2017/4/3.
 */
import static net.mindview.util.Print.*;
class Art {
    Art(){
        print("Art constructor");
    }
}

class Drawing extends Art {
    Drawing(){
        print("Drawing Constructor");
    }

}

public class Cartoon  extends Drawing{
    public Cartoon(){
        print("Cattoon constructor");
    }

    public static void main(String[] args) {
        Cartoon c = new Cartoon();

    }
}
