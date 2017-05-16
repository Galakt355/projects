interface Human{
    void live();
}

interface CanFight extends Human
{
    void fight();
}
interface CanSwim extends Human{
    void swim();
}
interface CanFly extends Human{
    void fly();
}
interface CanClimb extends CanFight, CanFly, CanSwim{
    void climb();
}

public class Adventure13
{
    public static void t(CanFight x){
        x.fight();
    }
    public static void w(ActionCharacter x){
        x.fight();
    }
    public static void u(CanSwim x){
        x.swim();
    }
    public static void v(CanFly x){
        x.fly();
    }
    public static void c(CanClimb x){
        x.climb();
    }
    public static void main(String[] args){
        Hero h = new Hero();
        System.out.println("Use " + h.getClass() + " both: CanFight");
        t(h);
        System.out.println("Use " + h.getClass() + " both: ActionCharacter");
        w(h);
        System.out.println("Use " + h.getClass() + " both: CanSwim");
        u(h);
        System.out.println("Use " + h.getClass() + " both: CanFly");
        v(h);
        System.out.println("Use " + h.getClass() + " both: CanClimb");
        c(h);

        Hero2 hero2 = new Hero2();
        hero2.fly();
        hero2.live();
    }
}

class ActionCharacter{
    public void fight(){}
}

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly, CanClimb{
    public void swim(){}
    public void fly(){}
    public void climb(){}
    public void live(){}
}

class Hero2 implements CanClimb{
    public void swim(){}
    public void fly(){
        System.out.println("I fly !!!");
    }
    public void climb(){}
    public void live(){
        System.out.println("I live !!!");
    }
    public void fight(){}
}