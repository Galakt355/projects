

public class Dog5{
				
    public static void main(String[] args){
		
		System.out.println(bark());
		System.out.println(bark("����������������� !"));
		System.out.println(bark(3));		
        
    }	
	
	static String bark(){
        return "��� ��� ���";
    }
	
	static String bark(String s){
        return s;
    }
	
	static String bark(int i){
        return "���� " + i + " ࠧ� !";
    }
	
}