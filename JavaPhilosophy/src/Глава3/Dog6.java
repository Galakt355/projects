
public class Dog6{
	String _name;
	String _says;
	
	public static void main(String[] args){
		Dog6 spot = new Dog6("Далматинец", "АФ АФ");
		Dog6 scruffy = new Dog6("Кавказец", "ГАФ ГАФ");
		Dog6 newDog = new Dog6("Новая собака", "Рррррррр");
		newDog = spot;
		
		
		System.out.println("spot == newDog: " + (spot == newDog));			
		System.out.println("spot.equals(newDog): " + spot.equals(newDog));		
	}
	
	Dog6(String name, String says){
		_name = name;
		_says = says;
	}
		
}