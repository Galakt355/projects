

public class Transfers21{	
	
	public static void main(String[] args){

        for(Money m : Money.values()){
			System.out.println("Name: " + m + ", number: " + m.ordinal());
		}
    } 

public enum Money{
	Rubles, 
	Dollars,
	Euro,
	PoundsSterling,
	Francs,
	Pesos,
}	
	
}

