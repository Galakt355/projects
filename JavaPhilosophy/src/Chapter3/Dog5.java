
public class Dog5{
	String _name;
	String _says;
	
	public static void main(String[] args){
		Dog5 spot = new Dog5("„ «¬ â¨­¥æ", "€” €”");
		Dog5 scruffy = new Dog5("Š ¢ª §¥æ", "ƒ€” ƒ€”");
		
		System.out.println("spot: " + spot._name + " " + spot._says);			
		System.out.println("scruffy: " + scruffy._name + " " + scruffy._says);		
	}
	
	Dog5(String name, String says){
		_name = name;
		_says = says;
	}
		
}