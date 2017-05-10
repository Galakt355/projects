
public class Cycle5
{
    
    public static void main(String[] args){
        Unicycle unicycle = new Unicycle();
        goRide(unicycle);
		
		Bicycle bicycle = new Bicycle();
		goRide(bicycle);
		
		Tricycle tricycle = new Tricycle();
		goRide(tricycle);
    }
	
	void ride(){
        System.out.println("Get method Cycle5.ride() !");
    }
	
	public static void goRide(Cycle5 cyc){
		cyc.ride();
	}
	
	int wheels(){
		return 0;
	}

}

class Unicycle extends Cycle5{
	
	@Override
	int wheels(){
        return 1;
    }
    
	@Override
    void ride(){
        System.out.println("Get methode Unicycle.ride() ! Number of wheels: " + wheels());
    }
}

class Bicycle extends Cycle5{
	
	@Override
	int wheels(){
        return 2;
    }
    
	@Override
    void ride(){
        System.out.println("Get methode Bicycle.ride() ! Number of wheels: " + wheels());
    }
}

class Tricycle extends Cycle5{
	
	@Override
	int wheels(){
        return 3;
    }
    
	@Override
    void ride(){
        System.out.println("Get methode Tricycle.ride() ! Number of wheels: " + wheels());
    }
}