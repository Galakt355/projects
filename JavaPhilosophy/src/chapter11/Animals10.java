import java.util.*;

public class Animals10
{
    private static RandomRodentsGen gen = new RandomRodentsGen();

    public static void main(String[] args){
        List<Rodent> rodentList = new ArrayList<Rodent>();
        for(int i = 0; i<5; i++) rodentList.add(gen.next());
        Iterator<Rodent> iterator = rodentList.iterator();

        System.out.println(rodentList);

        while (iterator.hasNext()){
            iterator.next().run();
        }
        while (iterator.hasNext()){
            iterator.next().eat();
        }
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