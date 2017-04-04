package chapter8;

/**
 * Created by danny on 2017/4/4.
 */
import static net.mindview.util.Print.*;
class Glyph {
    void draw(){ print("Gylph.draw()");}
    Glyph(){
        print("Glyph() Befor draw()");
        draw();
        print("Glyph() after draw()");
    }
}

class RoundGlyph extends Glyph{
    private int radius = 1;
    RoundGlyph( int r){
        radius = r;
        print("RounGlyph.RoundGlyph(),radius = " + radius);

    }
    void draw(){
        print("RoundGlyph.draw, radius = " + radius);
    }
}

public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
    }


}
