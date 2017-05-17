interface Cycle{
	void move();
}

interface CycleFactory{
	Cycle getCycle();
}

public class Go18
{
    public static void main(String[] args){
        goCycle(new UnicycleFactory());
        goCycle(new BicycleFactory());
        goCycle(new TricycleFactory());
    }
	
	public static void goCycle(CycleFactory factory){
		Cycle c = factory.getCycle();
		c.move();
	}
}

class UnicycleFactory implements CycleFactory{
	public Cycle getCycle(){
		return new Unicycle();
	}
}

class Unicycle implements Cycle{

    public void move(){
        System.out.println("Go to Unicycle !");
    }
}

class BicycleFactory implements CycleFactory{
	public Cycle getCycle(){
		return new Bicycle();
	}
}

class Bicycle implements Cycle{

    public void move(){
        System.out.println("Go to Bicycle !");
    }
}

class TricycleFactory implements CycleFactory{
	public Cycle getCycle(){
		return new Tricycle();
	}
}

class Tricycle implements Cycle{

    public void move(){
        System.out.println("Go to Tricycle !");
    }
}