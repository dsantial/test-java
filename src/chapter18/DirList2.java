package chapter18;

import java.io.*;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.*;

/**
 * Created by 390767 on 17-6-21.
 */
public class DirList2 {

    public static FilenameFilter filter(final String regex)
    {
        //Creation of anonymous inner class;
        return new FilenameFilter() {
            private Pattern pattern =Pattern.compile(regex);
            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(name).matches();
            }
        };//End of anonymous inner class
    }

    public static void main(String[] args) {
        File path = new File("./src/");
        String[] list;
        if (args.length==0)
            list= path.list();
        else
            list = path.list(filter(args[0]));
        Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
        for (String dirItem:list)
            System.out.println(dirItem);
    }

}

