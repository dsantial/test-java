package chapter18;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by 390767 on 17-7-11.
 */
public class TestBufferStream {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("./src/log4j.properties");
            BufferedInputStream bis = new BufferedInputStream(fis);
            int c=0;
            System.out.println((char)bis.read());
            System.out.println((char)bis.read());
            bis.mark(100);
            for (int i=0;i<=10 &&(c=bis.read())!=-1;i++)
            {
                System.out.print((char)c);
            }
            System.out.println();
            bis.reset();//重新回到原来标记的地方
            for (int i=0;i<=10 &&(c=bis.read())!=-1;i++)
            {
                System.out.print((char)c);
            }
            bis.close();
        }catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }catch (Exception e1)
        {
            e1.printStackTrace();
        }
    }
}
