

public class Extends3 extends ExtendsSecondary{
	
	public static void main(String[] args){
        Extends3 ext = new Extends3();
    }    
	
}

class ExtendsSecondary extends ExtendsPrime{
	
	ExtendsSecondary(){
		System.out.println("Call constructor ExtendsSecondary !");
	}
	
}

class ExtendsPrime{
	
	ExtendsPrime(){
		System.out.println("Call constructor ExtendsPrime !");
	}
	
}