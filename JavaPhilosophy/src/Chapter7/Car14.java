

public class Car14{
public Engine engine = new Engine();
	
	public static void main(String[] args){
        Car14 car = new Car14();
		car.engine.service();
    } 
	
}

class Engine{

void service(){
	System.out.println("Car service !");
	}
}