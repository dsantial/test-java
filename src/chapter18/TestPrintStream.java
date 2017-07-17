package chapter18;

import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * Created by 390767 on 17-7-17.
 */
public class TestPrintStream {
    public static void main(String[] args) {
        PrintStream ps = null;
        try {
            FileOutputStream fos = new FileOutputStream("./src/log.txt");
            ps = new PrintStream(fos);
            if (ps!=null){
                System.setOut(ps);
            }
            for (char c=0;c<=60000;c++){
                System.out.print(c+"\t");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
