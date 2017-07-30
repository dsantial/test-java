package chapter18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Created by 390767 on 17-7-11.
 */
public class TestBufferStream1 {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("./src/log.txt"));
            //在节点流FileWriter的外面再嵌套一层处理流Bufferedwrite
            String  s= null;
            for (int i=0;i<100;i++){
                s=String .valueOf(Math.random());
                bw.write(s);
                bw.newLine();
            }
            bw.flush();
            BufferedReader br = new BufferedReader(new FileReader("./src/log.txt"));
            while ((s=br.readLine())!=null)
            {
                System.out.println();
            }
            bw.close();
            br.close();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
