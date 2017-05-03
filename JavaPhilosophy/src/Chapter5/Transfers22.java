

public class Transfers22{	
	
	public static void main(String[] args){

        for(Money m : Money.values()){
			System.out.println("Name: " + m + ", number: " + m.ordinal());
			describee(m);
			}
    } 
	
	public static void describee(Money mon){
		switch(mon){
			case Rubles: System.out.println("Name: " + mon + " from Russia");
			break;
			case Dollars: System.out.println("Name: " + mon + " from USA");
			break;
			case Euro: System.out.println("Name: " + mon + " from Europ");
			break;
			case PoundsSterling: System.out.println("Name: " + mon + " from England");
			break;
			case Francs: System.out.println("Name: " + mon + " from France");
			break;
			case Pesos: System.out.println("Name: " + mon + " from Spain");
			break;
			
			default: break;
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

