interface CanFight{
	void fight();
}
interface CanSwim{
	void swim();
}
interface CanFly{
	void fly();
}
interface CanClimb{
	void climb();
}

public class Adventure12
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
    }
}

class ActionCharacter{
    public void fight(){}
}

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly, CanClimb{
	public void swim(){}
	public void fly(){}
	public void climb(){}
}