package chapter8;

/**
 * Created by danny on 2017/4/4.
 */
import sun.security.krb5.internal.crypto.Des;

import static net.mindview.util.Print.print;

class Characteristic {
    private String s;
    Characteristic(String s){
        this.s =  s;
        print("Creating Characteristic " + s);
    }
    protected  void dispose(){
        print("disposing Characteristic " + s);
    }
}

class Description {
    private String s;
    Description(String s){
        this.s = s;
        print("creating description " + s);
    }
    protected void dispose(){
        print("disposing Description " + s);
    }
}

class LivingCreature {
    private Characteristic p =
            new Characteristic("is alive");
    private Description t =
            new Description("Basic Living Creature");
    LivingCreature() {
        print("livingCreature  ");
    }
    protected void dispose(){
        print("livingCreature dispose");
        t.dispose();
        p.dispose();
    }

}

class Animal extends LivingCreature{
    private Characteristic p =
            new Characteristic("has heart");
    private Description t =
            new Description("Animal not Vegetable");
    Animal(){
        print("Animal()");
    }
    protected void dispose(){
        print("Animal dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}

class Amphibian extends Animal {
    private Characteristic p =
            new Characteristic("can live in water");
    private Description t =
            new Description("Both water and land");
    Amphibian(){
        print("Amphibian()");
    }
    protected void dispose(){
        print("Amphibian dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}


public class Frog extends Amphibian {
    private Characteristic p = new Characteristic("Croaks");
    private Description t = new Description("Eats bugs");
    public Frog (){ print("Frog()");}
    protected void dispose(){
        print("Frog dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        Frog frog = new Frog();
        print("Bye !");
        frog.dispose();
    }
}
