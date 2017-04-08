package chapter10;

/**
 * Created by danny on 2017/4/8.
 */
public class Parcel7 {
    public Contents contents(){
        return new Contents(){
            private int i = 11;
            public int value(){return i;}
        };
    }

    public static void main(String[] args) {
        Parcel7 p = new Parcel7();
        Contents c = p.contents();

    }
}
