

public class ConstructorsThis9{	
				
    public static void main(String[] args){
		
		ConstructorsThis9 constructorsThis = new ConstructorsThis9();		
        
    }		
	
	ConstructorsThis9(){
		this("Вызываю второй конструктор из первого.");
		System.out.println("Отрабатывает первый конструктор !");
	}
	
	ConstructorsThis9(String s){		
		System.out.println(s);
	}
	
}