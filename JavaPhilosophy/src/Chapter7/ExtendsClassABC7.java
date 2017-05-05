

public class ExtendsClassABC7{	
	
	public static void main(String[] args){
		System.out.println("Created object from class C !" + C.createdObject());
    }    
	
}

class A{
    A(int i){
        System.out.println("Call constructor A !");
    }
}

class B{
    B(int i){
        System.out.println("Call constructor B !");
    }
}

class C extends A{
    B field = new B(17);

    C(int i)
    {
        super(i);
    }

    static C createdObject(){
        C c = new C(7);
        return c;
    }
}