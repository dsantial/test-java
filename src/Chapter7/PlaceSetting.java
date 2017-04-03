package Chapter7;

/**
 * Created by danny on 2017/4/3.
 */
import static net.mindview.util.Print.*;

class plat{
    plat(int i){
        print("plat Constructor");
    }
}

class DinnerPlate extends plat{
    DinnerPlate(int i){
        super(i);
        print("DinnerPlat constructor");
    }
}
class Utensil {
    Utensil (int i){
        print("Utensil constructor");
    }
}

class Spoon extends Utensil{
    Spoon(int i ){
        super(i);
        print("Spoon constructor");
    }
}

class Fork extends Utensil{
    Fork(int i){
        super(i);
        print("Fork constructor");
    }
}

class Knife extends Utensil{
    Knife(int i){
        super(i);
        print("Knife constructor");
    }
}
class Custom{
    Custom(int i){
        print("Custom constructor");
    }
}
public class PlaceSetting extends Custom{
    private Spoon sp;
    private Fork fk;
    private Knife kn;
    private DinnerPlate pl;
    public PlaceSetting(int i ){
        super(i + 1);
        sp = new Spoon(i+2);
        fk = new Fork(i+3);
        kn = new Knife(i+4);
        pl = new DinnerPlate(i + 5);
        print("PlaceSetting constructor");
    }
    public static void main(String[] args){
        PlaceSetting x = new PlaceSetting(9);
    }
}
