
public class Sandwich11 extends PortableLunch
{
	private Bread b = new Bread();
	private Cheese c = new Cheese();
	private Lettuce l = new Lettuce();
	private Pickle p = new Pickle();
	
	public Sandwich11(){
		System.out.println("Start: Sandwich11()");
	}
	
    public static void main(String[] args){
        new Sandwich11();
		System.out.println("Goooooo");
    }

}

class Meal{
    Meal(){
		System.out.println("Start: Meal()");
	}
}

class Bread{
    Bread(){
		System.out.println("Start: Bread()");
	}
}

class Cheese{
    Cheese(){
		System.out.println("Start: Cheese()");
	}
}

class Lettuce{
    Lettuce(){
		System.out.println("Start: Lettuce()");
	}
}

class Pickle{
    Pickle(){
		System.out.println("Start: Pickle()");
	}
}

class Lunch extends Meal{
    Lunch(){
		System.out.println("Start: Lunch()");
	}
}

class PortableLunch extends Lunch{
    PortableLunch(){
		System.out.println("Start: PortableLunch()");
	}
}