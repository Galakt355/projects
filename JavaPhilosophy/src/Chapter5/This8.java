

public class This8{
	
	String s;
				
    public static void main(String[] args){
		
		This8 this8 = new This8();
		this8.s = "��⮤ ��।��� ��뫪� �� �맢��訩 ��� ��ꥪ� � ��⮤ �����頥� ��ꥪ�. ";
		System.out.println(this8.metod().s);
        
    }		
	
	This8 metod(){
		metod2();
		this.metod2();
		return this;
	}
	
	void metod2(){
		this.s += " ������� �� �� ��஬ ��⮤� !";
		System.out.println("��뢠���� ��� ࠧ� � �� ��ன ࠧ � ������� this");
	}
	
}