import java.util.*;

public class Animals9
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

class Rodent{
    void run(){
        System.out.println("Rodent.run()");
    }
    void eat(){
        System.out.println("Rodent.eat()");
    }
}

class Mouse extends Rodent{
	@Override
    void run(){
        System.out.println("Mouse runs fast !");
    }
	@Override
    void eat(){
        System.out.println("Hamster eats a lot of food !");
    }
}

class Hamster extends Rodent{
	@Override
    void run(){
        System.out.println("Hamster runs slowly !");
    }
	@Override
    void eat(){
        System.out.println("The mouse eats a little food !");
    }
}