package chapter5;

/**
 * Created by danny on 2017/4/2.
 */
enum  Spiciness{
    NOT,MILD,MEDIUM,HOT,FLAMING
}
public class Burrito {
    Spiciness degree;
    public Burrito (Spiciness degree){this.degree = degree;}
    public void describe(){
        System.out.print("this burrito is ");
        switch (degree){
            case NOT:System.out.println("no spicy at all.");
                                             break;
            case MILD:
            case MEDIUM:System.out.println("a little hot.");
            case HOT:
            case FLAMING:
                default:System.out.println("maybe too hot.");
        }
    }

    public static void main(String[] args) {
        Burrito
                plain = new Burrito(Spiciness.NOT),
                greenChile = new Burrito(Spiciness.MEDIUM),
                jalapeno = new Burrito(Spiciness.HOT);
        plain.describe();
        greenChile.describe();
        jalapeno.describe();



    }

}
