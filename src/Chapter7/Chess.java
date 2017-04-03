package Chapter7;

/**
 * Created by danny on 2017/4/3.
 */
import static net.mindview.util.Print.*;
class Game{
    Game(int i){
        print("Game Constructor");
    }
}

class BoardGame extends Game{
    BoardGame(int i){
        super(i);
        print("BoardGame constructor");
    }
}

public class Chess extends BoardGame{
    Chess(){
        super(11);
        print("Chess constructor");

    }

    public static void main(String[] args) {
        Chess c = new Chess();
    }
}
