import java.util.Scanner;

public class Fibonachi23{
	
	static long fibNew = 1;
	static long fibOld = 1;
	
    public static void main(String[] args){
		
		System.out.print("����쪮 �ᥫ ������� ����室��� �뢥�� ?: ");
		Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();
		if(val <= 0) return;
        System.out.println("������� 稫�: " + val);
				
		for(int i=1; i <= val; i++){			
			
			switch(i){
				case 1:
				System.out.println("1");
				break;
				case 2:
				System.out.println("1");
				break;				
				
				default: 
				long cum = fibNew + fibOld;
				fibNew = fibOld;
				fibOld = cum;				
				System.out.println(cum);
				break;
			}
					
		}		
		
    }	
	
}