import java.util.Random;

public class EagleAndTails{
		
	public static void main(String[] args){
		Random random = new Random();

        if (random.nextInt()%2 == 0){
            System.out.println("�����");
        }
        else{
            System.out.println("���");
        }
	}	
		
}