public class Music9
{
    public static void main(String[] args){
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind(),
        };
        tuneAll(orchestra);
        for(Instrument i : orchestra) System.out.println(i);
    }

    public static void tune(Instrument i){
        i.play();
        i.adjust();
    }

    public static void tuneAll(Instrument[] e){
        for(Instrument i : e) tune(i);
    }
}

abstract class Instrument{
    @Override
    public String toString() {
        return what();
    }
    abstract void play();
    abstract String what();
    abstract void adjust();
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