

public class DogOrder6{
				
    public static void main(String[] args){
		
		System.out.println(bark());
		System.out.println(bark("����������������� !", 7));
		System.out.println(bark(3, "���� "));		
        
    }	
	
	static String bark(){
        return "��� ��� ���";
    }
	
	static String bark(String s, int i){
        return "���� " + i + " ࠧ� !";
    }
	
	static String bark(int i, String s){
        return s + i + " ࠧ� !";
    }
	
}