

public class Root9{
	
	static Component1 component1;
    static Component2 component2;
    static Component3 component3;

    Root9(){
        System.out.println("Call constructor Root9 default !");
        component1 = new Component1();
        System.out.println("!!!!!!!!!!!!!! Created object from class Component1 !" + component1);
        component2 = new Component2();
        System.out.println("!!!!!!!!!!!!!! Created object from class Component2 !" + component2);
        component3 = new Component3();
        System.out.println("!!!!!!!!!!!!!! Created object from class Component3 !" + component3);
    }

    public static void main(String[] args){
        Stem stem = new Stem(component1, component2, component3);
    } 
	
}

class Stem extends Root9{
    Stem(Component1 component1, Component2 component2, Component3 component3){

    }
}

class Component1{
    Component1(){
        System.out.println("Call constructor Component1 !");
    }
}

class Component2{
    Component2(){
        System.out.println("Call constructor Component2 !");
    }
}

class Component3{
    Component3(){
        System.out.println("Call constructor Component3 !");
    }
}