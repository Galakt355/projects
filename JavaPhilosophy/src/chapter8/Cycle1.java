
public class Cycle1
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
        System.out.println("Get method Cycle1.ride() !");
    }
	
	public static void goRide(Cycle1 cyc){
		cyc.ride();
	}

}

class Unicycle extends Cycle1{
    
    void ride(){
        System.out.println("Get methode Unicycle.ride() !");
    }
}

class Bicycle extends Cycle1{
    
    void ride(){
        System.out.println("Get methode Bicycle.ride() !");
    }
}

class Tricycle extends Cycle1{
    
    void ride(){
        System.out.println("Get methode Tricycle.ride() !");
    }
}