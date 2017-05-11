import java.util.*;

public class Music8
{
    private static RandomInstrumentGen gen = new RandomInstrumentGen();

    public static void main(String[] args){
        Instrument[] orchestra = new Instrument[9];
        for(int i = 0; i<orchestra.length; i++) orchestra[i] = gen.next();
        for(Instrument i : orchestra) System.out.println(i);
    }

    public static void tune(Instrument i){
        i.play();
    }

    public static void tuneAll(Instrument[] e){
        for(Instrument i : e) tune(i);
    }
}

class RandomInstrumentGen{
    private Random rand = new Random(50);

    public Instrument next(){
        switch(rand.nextInt(6)){
            default:
            case 0: return new Wind();
            case 1: return new Percussion();
            case 2: return new Stringed();
            case 3: return new Wind();
            case 4: return new Woodwind();
            case 5: return new Keyboard();
        }
    }
}

class Instrument{
    @Override
    public String toString() {
        return what();
    }
    void play(){
        System.out.println("Instrument.play()");
    }
    String what(){
        return "Instrument !";
    }
    void adjust(){
        System.out.println("Adjusting Instrument");
    }
}

class Keyboard extends Instrument{
    void play(){
        System.out.println("Keyboard.play()");
    }
    String what(){
        return "Keyboard !";
    }
    void adjust(){
        System.out.println("Adjusting Keyboard");
    }
}

class Wind extends Instrument{
    void play(){
        System.out.println("Wind.play()");
    }
    String what(){
        return "Wind !";
    }
    void adjust(){
        System.out.println("Adjusting Wind");
    }
}

class Percussion extends Instrument{
    void play(){
        System.out.println("Percussion.play()");
    }
    String what(){
        return "Percussion !";
    }
    void adjust(){
        System.out.println("Adjusting Percussion");
    }
}

class Stringed extends Instrument{
    void play(){
        System.out.println("Stringed.play()");
    }
    String what(){
        return "Stringed !";
    }
    void adjust(){
        System.out.println("Adjusting Stringed");
    }
}

class Brass extends Wind{
    void play(){
        System.out.println("Brass.play()");
    }
    void adjust(){
        System.out.println("Adjusting Instrument");
    }
}

class Woodwind extends Wind{
    void play(){
        System.out.println("Woodwind.play()");
    }
    String what(){
        return "Woodwind !";
    }
}