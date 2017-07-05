package chapter18;
import net.mindview.util.*;

import java.io.File;

import static net.mindview.util.Print.*;
/**
 * Created by 390767 on 17-6-21.
 */

public class DirectoryDemo {
    public static void main(String[] args) {
        //All directories;
//        PPrint.pprint(Directory.walk(".").dirs);
        //All files beginning with 'T'
        for (File file:Directory.local(".","T.*"))
            print(file);
        print("---------------------");
        //All java files beginning with 'T';
        for (File file:Directory.walk(".","T.*\\.java"))
            print(file);
        print("=======================");
        //Class files containing "Z" or "z";
        for (File file:Directory.walk(".",".*[Zz}.*\\.class"))
            print(file);
    }
}
