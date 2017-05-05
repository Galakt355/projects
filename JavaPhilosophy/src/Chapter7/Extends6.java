

public class Extends6 extends Secondary{
	
	Extends6(){
		super(17);
		System.out.println("Call constructor Extends6 !");
	}
	
	public static void main(String[] args){		
        Extends6 ext = new Extends6();		
		System.out.println("Created object from class Extends6 !" + ext);
    }    
	
}

class Secondary extends Prime{	
		
	Secondary(int i){
		super(i);
		System.out.println("Call constructor Secondary !");	
		//super(i);		
	}	
}

class Prime{
	
	Prime(int i){
		System.out.println("Call constructor Prime !");
	}	
}