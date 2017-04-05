package chapter9;

/**
 * Created by danny on 2017/4/5.
 */
interface Canfight{void fight();}

interface CanSwim{void swim();}

interface CanFly{void fly();}

class ActionCharacter{
    public void fight(){}
}

class Hero extends ActionCharacter
        implements Canfight,CanFly,CanSwim{
    public void swim(){}
    public void fly(){}
}


public class Adventure {
    public static void t(Canfight x) {x.fight();}
    public static void u(CanSwim x){x.swim();}
    public static void v(CanFly x){x.fly();}
    public static void w(ActionCharacter x){x.fight();}

    public static void main(String[] args) {
        Hero h = new Hero();
        t(h);
        u(h);
        v(h);
        w(h);
    }

}
