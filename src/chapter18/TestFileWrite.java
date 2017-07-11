package chapter18;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * Created by 390767 on 17-7-11.
 */
/*
使用FileWriter向指定文件重写如数据，写入数据时以一个字符为单位进行写入
 */
public class TestFileWrite {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw =new FileWriter("./src/testFileWriter");
            for (int c= 0;c<=60000;c++)
            {
                fw.write(c);
            }
            int b=0;
            long num = 0;
            FileReader fr = null;
                   fr=  new FileReader("./src/testFileWriter");
            while ((b= fr.read())!=-1){
                System.out.print((char)b +"\t");
                num++;
            }
            System.out.println();
            System.out.println("总共读取了" + num +"个字符");
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
