

public class ExtendsClassABC5{	
	
	public static void main(String[] args){
		System.out.println("Created object from class C !" + C.createdObject());
    }    
	
}

class A{
    A(){
        System.out.println("Call constructor A !");
    }
}

class B{
    B(){
        System.out.println("Call constructor B !");
    }
}

class C extends A{
    B field = new B();

    static C createdObject(){
        C c = new C();
        return c;
    }
}