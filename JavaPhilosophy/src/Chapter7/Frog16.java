
class Amphibian{
	
	static void go(Amphibian am){
	System.out.println("Amphibian go() ! " + am.getClass());
    } 	
}

public class Frog16 extends Amphibian{
	
	public static void main(String[] args){
	Frog16 frog = new Frog16();
	Amphibian.go(frog);
    } 	
}