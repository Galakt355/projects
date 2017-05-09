

public class Homer13{
	
	public static void main(String[] args){
        Bart bart = new Bart();
		bart.motion("Go !");
		bart.motion(7);
		bart.motion(9.8F);
		bart.motion(17, "Aaaaaaa !");
    } 
	
	void motion(String s){
	System.out.println(s);
	}
	
	void motion(int i){
	System.out.println("Run " + i + " Km\\h");
	}
	
	void motion(float f){
	System.out.println("Fall " + f + " M\\s");
	}
}

class Bart extends Homer13{

void motion(int i, String s){
	System.out.println("Driving speed " + i + " M\\s " + s);
	}
}