package chapter10;

import sun.security.krb5.internal.crypto.Des;

/**
 * Created by danny on 2017/4/8.
 */
public class Parcel5 {
    public Destination destination (String s){
        class PDestination implements Destination{
            private String label;
            private PDestination(String whereTo){
                label = whereTo;
            }
            public String readlable(){return label;}
        }
        return new PDestination(s);
    }

    public static void main(String[] args) {
        Parcel5 p = new Parcel5();
        Destination d = p.destination("Tasmania");
    }
}
