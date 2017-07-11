package chapter18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by 390767 on 17-7-11.
 */
public class TestFileOutputStream {
    public static void main(String[] args) {
        int b = 0;
        FileInputStream in=null;
        FileOutputStream out= null;

        try {
            in = new FileInputStream("./src/log4j.properties");
            out = new FileOutputStream("./src/testOutput");
            while ((b=in.read())!=-1){
                out.write(b);
            }
            in.close();
            out.close();
        }catch (FileNotFoundException e)
        {
            System.out.println("文件读取失败");
            System.exit(-1);
        }catch (IOException e1)
        {
            System.out.println("文件复制失败");
            System.exit(-1);
        }
        System.out.println("test");
    }
}
