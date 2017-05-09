

public class Root12 extends Stem{
	
	private Component1 component1;
    private Component2 component2;
    private Component3 component3;

    public Root12(int i){
	   super(i + 1);	
        System.out.println("Call constructor Root12 default !");
        component1 = new Component1(1);
        System.out.println("!!!!!!!!!!!!!! Created object from class Component1 !" + component1);
        component2 = new Component2(2);
        System.out.println("!!!!!!!!!!!!!! Created object from class Component2 !" + component2);
        component3 = new Component3(3);
        System.out.println("!!!!!!!!!!!!!! Created object from class Component3 !" + component3);
    }

    public static void main(String[] args){
        Root12 root = new Root12(7);
		try{
		System.out.println("Code and exception handling !");
		}
		finally{
		root.dispose();
		}
    } 
	
	void dispose(){
	System.out.println("Root12.dispose() completion !");
	component3.dispose();
	component2.dispose();
	component1.dispose();
	super.dispose();
	}
	
}

class Stem{

Stem(int i){
   System.out.println("Get constructor Stem !");
}

void dispose(){
	System.out.println("Completion !");
	}
}

class Component1 extends Stem{
    Component1(int i){
	    super(i);   
        System.out.println("Call constructor Component1 !");
    }
	void dispose(){
   System.out.println("Component1 completion !");
   super.dispose();
}
}

class Component2 extends Stem{
    Component2(int i){
	   super(i); 
        System.out.println("Call constructor Component2 !");
    }
	void dispose(){
   System.out.println("Component2 completion !");
   super.dispose();
}
}

class Component3 extends Stem{
    Component3(int i){
	   super(i); 
        System.out.println("Call constructor Component3 !");
    }
	void dispose(){
   System.out.println("Component3 completion !");
   super.dispose();
}
}