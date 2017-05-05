

public class Extends4 extends ExtendsSecondary{
	
	Extends4(){
		System.out.println("Call constructor Extends4 !");
	}
	
	public static void main(String[] args){
		ExtendsSecondary.createdObject();
		
        Extends4 ext = new Extends4();		
		System.out.println("Created object from class Extends4 !" + ext);
    }    
	
}

class ExtendsSecondary extends ExtendsPrime{
	
	static void createdObject(){
		ExtendsSecondary ext = new ExtendsSecondary();
		System.out.println("Created object from class ExtendsSecondary !" + ext);
	}
		
	ExtendsSecondary(){
		System.out.println("Call constructor ExtendsSecondary !");
	}
	
}

class ExtendsPrime{
	
	ExtendsPrime(){
		System.out.println("Call constructor ExtendsPrime !");
	}
	
}