

public class PrimeNumber18{	
	
    public static void main(String[] args){
		
		boolean flag = true;
								
		for(int x=2; x < 100; x++){			
			for(int y=2; y < x; y++){
				if(x%y == 0){
					flag = false;
					break;
				}				
			}	
			if(flag){
				System.out.println(x + " - Простое число");	
			}
			flag = true;			
		}	
		
    }	
}