package Chapter7;

import chapter5.InitialValues;

/**
 * Created by danny on 2017/4/3.
 */
class Instrument{
    public void play(){}
    static void tune(Instrument i){
        i.play();
    }
}
public class Wind extends Instrument {
    public static void main(String[] args) {
        Wind flute = new Wind();
        Instrument.tune(flute);
    }
}
