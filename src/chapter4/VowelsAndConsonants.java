package chapter4;

/**
 * Created by danny on 2017/3/31.
 */
import java.util.*;
import net.mindview.util.Print.*;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        Random rand = new Random(47);
        for (int i = 0;i <100;i++){
            int c = rand.nextInt(26) + 'a';
            printnb((char)c + "," + c + ":");
            switch (c){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u': print("vowel");
                case 'y':
                case 'w': print("sometime a vowel");
                        break;
                        default:print("consonant");

            }
        }
    }
}
