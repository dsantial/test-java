package chapter18;

import java.io.IOException;
import java.io.StringReader;

/**
 * Created by 390767 on 17-6-22.
 */
public class MemoryInput {
    public static void main(String[] args) throws IOException{
        StringReader in = new StringReader(BufferedInputFile.read("./src/chapter18/MemoryInput.java"));
        int c;
        while ((c=in.read())!=-1)
            System.out.print((char)c);

    }
}
