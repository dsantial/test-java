package chapter18;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 * Created by 390767 on 17-7-11.
 */
public class TestTransform1 {
    public static void main(String[] args) {
        try {
            OutputStreamWriter osw=new OutputStreamWriter(
                    new FileOutputStream("./src/test.log")
            );
            osw.write("MircosofesunIBMOracleApplet");
            System.out.println(osw.getEncoding());
            osw.close();
            osw= new OutputStreamWriter(new FileOutputStream(
                    "./src/test.log",true
            ),"ISO8859_1");
            osw.write("MircosoftsunIBMOracleApplet");
            System.out.println(osw.getEncoding());
            osw.close();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
