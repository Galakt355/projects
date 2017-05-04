import mypackage.*;

public class AccessLevels5{
	
	public String publ = "public publ !";	
	protected String protect = "protected protect !";
	String pack = "package pack !";
	private String priv = "private priv !";
	
	public static void main(String[] args){

        AccessLevels5 accessLevels = new AccessLevels5();
		System.out.println(accessLevels.publ);
		System.out.println(accessLevels.protect);
		System.out.println(accessLevels.pack);
		System.out.println(accessLevels.priv);
		
		accessLevels.publ();
		accessLevels.protect();
		accessLevels.pack();
		accessLevels.priv();
		
		MyClass5 myClass5 = new MyClass5();
		System.out.println(myClass5.getClass());
		System.out.println(myClass5.publ2);		
		System.out.println(myClass5.protect2);		
		System.out.println(myClass5.pack2);		
		System.out.println(myClass5.priv2);		
		myClass5.publ2();
		myClass5.protect2();
		myClass5.pack2();
		myClass5.priv2();
    }
	
	public void publ(){
		System.out.println("public publ() !");
	}
	
	protected void protect(){
		System.out.println("protected protect() !");
	}
	
	void pack(){
		System.out.println("package pack() !");
	}
	
	private void priv(){
		System.out.println("private priv() !");
	}
	
	
}

