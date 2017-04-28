

public class ConstructorOverload4{
				
    public static void main(String[] args){
		
		ConstructorOverload4 constructor = new ConstructorOverload4();
		ConstructorOverload4 constructorOverload = new ConstructorOverload4("Вызов из перегруженого конструктора");
        
    }	
	
	ConstructorOverload4(){
        System.out.println("Вызов из конструктора");
    }
	
	ConstructorOverload4(String s){
        System.out.println(s);
    }
	
}