

public class This8{
	
	String s;
				
    public static void main(String[] args){
		
		This8 this8 = new This8();
		this8.s = "Метод передает ссылку на вызвавший его объект и метод возвращает объект. ";
		System.out.println(this8.metod().s);
        
    }		
	
	This8 metod(){
		metod2();
		this.metod2();
		return this;
	}
	
	void metod2(){
		this.s += " Добавил это во втором методе !";
		System.out.println("Вызывается два раза и во второй раз с помощью this");
	}
	
}