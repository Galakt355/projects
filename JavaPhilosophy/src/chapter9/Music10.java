interface Iplayable{
    void play();
    void adjust();
}

public class Music10
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

    public static void tune(Iplayable i){
        i.play();
        i.adjust();
    }

    public static void tuneAll(Instrument[] e){
        for(Instrument i : e) tune(i);
    }
}

abstract class Instrument implements Iplayable{
    @Override
    public String toString() {
        return what();
    }
    abstract String what();
}

class Wind extends Instrument{
    public void play(){
        System.out.println("Wind.play()");
    }
    String what(){
        return "Wind !";
    }
    public void adjust(){
        System.out.println("Adjusting Wind");
    }
}

class Percussion extends Instrument{
    public void play(){
        System.out.println("Percussion.play()");
    }
    String what(){
        return "Percussion !";
    }
    public void adjust(){
        System.out.println("Adjusting Percussion");
    }
}

class Stringed extends Instrument{
    public void play(){
        System.out.println("Stringed.play()");
    }
    String what(){
        return "Stringed !";
    }
    public void adjust(){
        System.out.println("Adjusting Stringed");
    }
}

class Brass extends Wind{
    public void play(){
        System.out.println("Brass.play()");
    }
    public void adjust(){
        System.out.println("Adjusting Instrument");
    }
}

class Woodwind extends Wind{
    public void play(){
        System.out.println("Woodwind.play()");
    }
    String what(){
        return "Woodwind !";
    }
}