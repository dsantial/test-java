package chapter18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by 390767 on 17-7-11.
 */
public class TestFileInputStream {
    public static void main(String[] args) {
        int b =0;
        FileInputStream in = null;

        try {
            in = new FileInputStream("./src/log4j.properties");
        }catch (FileNotFoundException e)
        {
            System.out.println("系统找不到指定文件！");
            System.exit(-1);
        }
        long num = 0;
        try {
            while ((b = in.read())!=-1){
                System.out.print((char) b);
                num++;
            }
            in.close();//关闭输入流
            System.out.println();
            System.out.println("总共读取了" + num +"个字节的文件");

        }catch (IOException e2){
            System.out.println("文件读取错误！");
        }
    }
}
