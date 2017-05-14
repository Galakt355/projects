import java.util.*;

public class Animals7
{
    private static RandomRodentsGen gen = new RandomRodentsGen();

    public static void main(String[] args){
        Rodent[] rodents = new Rodent[5];
        for(int i = 0; i<rodents.length; i++) rodents[i] = gen.next();
        for(Rodent i : rodents) i.run();
        for(Rodent i : rodents) i.eat();
    }

}

class RandomRodentsGen{
    private Random rand = new Random();

    public Rodent next(){
        switch(rand.nextInt(2)){
            default:
            case 0: return new Mouse();
            case 1: return new Hamster();
        }
    }
}

interface Rodent{
    void run();
    void eat();
}

class Mouse implements Rodent{
    @Override
    public void run(){
        System.out.println("Mouse runs fast !");
    }
    @Override
    public void eat(){
        System.out.println("Hamster eats a lot of food !");
    }
}

class Hamster implements Rodent{
    @Override
    public void run(){
        System.out.println("Hamster runs slowly !");
    }
    @Override
    public void eat(){
        System.out.println("The mouse eats a little food !");
    }
}