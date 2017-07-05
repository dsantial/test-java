package chapter18;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

/**
 * Created by 390767 on 17-6-22.
 */
public class FormattedMemoryInput {
    public static void main(String[] args) throws IOException {
        try{
            DataInputStream in = new DataInputStream(
                    new ByteArrayInputStream(
                            BufferedInputFile.read(
                                    "./src/chapter18/FormattedMemoryInput.java"
                            ).getBytes()
                    )
            );
            while (true)
                System.out.print((char)in.readByte());
        }catch (EOFException e){
            System.err.println("End of stream");
        }

    }
}
