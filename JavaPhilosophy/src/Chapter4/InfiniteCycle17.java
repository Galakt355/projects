import java.util.Random;

public class InfiniteCycle17{	
	
    public static void main(String[] args){
		int valNew;
		int valOld;
		Random random = new Random();
		valOld = random.nextInt(10);
						
		while(true){
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