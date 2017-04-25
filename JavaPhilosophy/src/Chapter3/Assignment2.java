
public class Assignment2{
	public static void main(String[] args){
		Tank t34 = new Tank();
		Tank t90 = new Tank();
		t34.fuel = 594.0f;
		t90.fuel = 1700.0f;
		System.out.println("1: t34.fule: " + t34.fuel + ", t90.fule: " + t90.fuel);
		t34 = t90;
		System.out.println("1: t34.fule: " + t34.fuel + ", t90.fule: " + t90.fuel);
		t34.fuel = 2000.0f;
		System.out.println("1: t34.fule: " + t34.fuel + ", t90.fule: " + t90.fuel);
	}
}

class Tank{
    float fuel;
}