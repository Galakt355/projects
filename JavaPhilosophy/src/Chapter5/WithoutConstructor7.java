

public class WithoutConstructor7{
				
    public static void main(String[] args){
		
		WithoutConstructor7 withoutConstructor = new WithoutConstructor7();		
		withoutConstructor.metod();
        
    }		
	
	void metod(){
		System.out.println("Вызывается методом из объекта созданого конструктором по умолчанию !");
	}
	
}