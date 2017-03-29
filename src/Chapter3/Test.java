package Chapter3;

/**
 * Created by danny on 2017/3/30.
 */

import java.util.Date;
import java.util.*;

/**  The first thinking in java example program
 * Display a string and today's date
 * @author danny
 * @version 1.0
 * Created by danny on 2017/3/30.
 */
public class Test {
    /** Entry point to class &application.
     @param args array of string arguments
     */
    public static void main(String[] args){
//        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(
                System.getProperty("java.library.path")
        );
        System.out.println(new Date());
    }
}