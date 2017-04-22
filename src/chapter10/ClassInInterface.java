package chapter10;

/**
 * Created by danny on 2017/4/17.
 */
public interface ClassInInterface {
    void howdy();
    class Test implements ClassInInterface{
        public void howdy(){
            System.out.println("Howdy!");
        }

        public static void main(String[] args) {
            new Test().howdy();
        }
    }
}
