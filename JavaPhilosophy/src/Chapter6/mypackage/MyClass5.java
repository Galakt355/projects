package mypackage;

public class MyClass5{
	
	public String publ2 = "public publ2 !";	
	protected String protect2 = "protected protect2 !";
	String pack2 = "package pack2 !";
	private String priv2 = "private priv2 !";
		
	public void publ2(){
		System.out.println("public publ2() !");
	}
	
	protected void protect2(){
		System.out.println("protected protect2() !");
	}
	
	void pack2(){
		System.out.println("package pack2() !");
	}
	
	private void priv2(){
		System.out.println("private priv2() !");
	}
		
}