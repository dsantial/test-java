package chapter4;

/**
 * Created by danny on 2017/3/31.
 */
import static net.mindview.util.Print.*;

public class LabeledFor {
    public static void main(String[] args) {
        int i=0;
        outer: //Can't have statements here
        for (;true;)
        {
            inner: //Cant have statements here
            for (;i<10;i++){
                print("i = "+ i);
                if (i==2){
                    print("continue");
                    continue ;
                }
                if (i==3){
                    print("break");
                    i++;//otherwise i never
                        //gets increment.
                    break ;
                }
                if (i==7){
                    print("continue outer");
                    i++; //Otherwise i never
                        //gers incremented.
                    continue outer;
                }
                if (i == 8){
                    print("break outer");
                    break outer;
                }
                for (int k= 0;k<5;k++){
                    if (k==3){
                        print("continue inner");
                        continue inner;
                    }
                }
            }
        }
    }
}
