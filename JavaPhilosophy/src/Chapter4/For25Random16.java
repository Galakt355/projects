import java.util.Random;

public class For25Random16{	
	
    public static void main(String[] args){
		int valNew;
		int valOld;
		Random random = new Random();
		valOld = random.nextInt(10);
						
		for(int i=1; i <= 25; i++){
			valNew = random.nextInt(10);
			
			if(valOld > valNew){
				System.out.println(valOld + " ����� " + valNew);
			}
			else if(valOld < valNew){
				System.out.println(valOld + " ����� " + valNew);
			}
			else{
				System.out.println(valOld + " ����� " + valNew);
			}
			
			valOld = valNew;
		}		
    }	
}