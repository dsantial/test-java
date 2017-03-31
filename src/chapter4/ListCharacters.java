package chapter4;

/**
 * Created by danny on 2017/3/31.
 */
public class ListCharacters {
    public static void main(String[] args) {
        for (char c = 0;c <128; c++)
            if (Character.isLowerCase(c))
                System.out.println("value: " + (int)c + "charactar: " +c);
    }
}
