

public class ConstructorOverload4{
				
    public static void main(String[] args){
		
		ConstructorOverload4 constructor = new ConstructorOverload4();
		ConstructorOverload4 constructorOverload = new ConstructorOverload4("�맮� �� ��ॣ�㦥���� ���������");
        
    }	
	
	ConstructorOverload4(){
        System.out.println("�맮� �� ���������");
    }
	
	ConstructorOverload4(String s){
        System.out.println(s);
    }
	
}