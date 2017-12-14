package propFile;

import scala.io.BufferedSource;

import javax.xml.transform.Source;
import java.io.*;
import java.net.URL;
import java.util.Properties;

/**
 * Created by 390767 on 17-12-14.
 * 指定jar包目录，以及添加properties文件
 */
public class PropTest {

    public static void main(String[] args) {


readPropFile();


    }
    public static void readPropFile() {
        System.out.println("df");
        String filePath =System.getProperty("user.dir")+"/conf.properties";
        Properties properties=new Properties();
        try {
           FileInputStream inputStream=new FileInputStream(filePath);
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(inputStream,"utf-8"));
            properties.load(bufferedReader);
            System.out.println(properties.getProperty("中国"));


        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e2){
            e2.printStackTrace();
        }

    }





}
