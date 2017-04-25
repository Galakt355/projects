
public class MathOps4{	
	
	public static void main(String[] args){
		Tank t34 = new Tank();
		t34.calculateSpeed();		
		System.out.println("1: t34.speed: " + t34.speed + " ª¬\\ç");			
	}
		
}

class Tank{
	public static final int spacing = 100;
	public static final int time = 2;
		
		int speed;
		
		void calculateSpeed(){
			speed = spacing / time;
		}
	}