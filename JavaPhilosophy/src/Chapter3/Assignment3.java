
public class Assignment3{
	public static void main(String[] args){
		Tank t34 = new Tank();
		t34.fuel = 594f;		
		System.out.println("1: t34.fuel: " + t34.fuel);
		
		metod(t34);		
		System.out.println("1: t34.fuel: " + t34.fuel);		
	}
	
	static void metod(Tank t){
		t.fuel = 2000f;
	}
}

class Tank{
    float fuel;
}