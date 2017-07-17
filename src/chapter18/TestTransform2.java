package chapter18;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by 390767 on 17-7-17.
 */
public class TestTransform2 {
    public static void main(String[] args) {

        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            //System.in 用来接收从键盘输入的数据
            BufferedReader br = new BufferedReader(isr);
            String s = null;
            s =br.readLine();
            while (s!=null){
                System.out.println(s.toUpperCase());
                s= br.readLine();//在循环体内继续接收从键盘的输入
                if (s.equalsIgnoreCase("exit"))
                {//只要输入exit循环就结束，退出程序
                    break;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
