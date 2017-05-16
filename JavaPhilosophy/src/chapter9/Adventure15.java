interface CanSwim{
    void swimFast();
    void swimSlow();
}
interface CanFly{
    void flyFast();
    void flySlow();
}
interface CanClimb{
    void climbFast();
    void climbSlow();
}

interface Human extends CanClimb, CanFly, CanSwim{
    void live();
}

public class Adventure15
{
    public static void methodHuman(Human val){
        val.live();
        val.swimFast();
        val.swimSlow();
        val.flyFast();
        val.flySlow();
        val.climbFast();
        val.climbSlow();
    }
    public static void methodSwim(CanSwim val){
        val.swimFast();
        val.swimSlow();
    }
    public static void methodFly(CanFly val){
        val.flyFast();
        val.flySlow();
    }
    public static void methodClimb(CanClimb val){
        val.climbFast();
        val.climbSlow();
    }
    public static void main(String[] args){
        Hero hero = new Hero();
        hero.fight();
        methodHuman(hero);
        methodSwim(hero);
        methodFly(hero);
        methodClimb(hero);
    }
}

abstract class Man{
    public abstract void fight();
}

class Hero extends Man implements Human{

    public void live(){
        System.out.println("I live !");
    }

    public void climbFast(){
        System.out.println("Quickly climbs !");
    }

    public void climbSlow(){
        System.out.println("Slowly climbs !");
    }

    public void flyFast(){
        System.out.println("Swiftly flies !");
    }

    public void flySlow(){
        System.out.println("Slowly flies !");
    }

    public void swimFast(){
        System.out.println("Swiftly swims !");
    }

    public void swimSlow(){
        System.out.println("Slowly swims !");
    }

    public void fight()
    {
        System.out.println("Attack !!!!");
    }
}