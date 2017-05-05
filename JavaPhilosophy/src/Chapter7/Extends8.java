

public class Extends8 extends Prime{
	
	Extends8(){
        super(7);
        System.out.println("Call constructor Extends8 default !");
        Prime prime = new Prime(7);
        System.out.println("Created object from class Prime !" + prime);
    }

    Extends8(int i){
        super(17);
        System.out.println("Call constructor Extends8 arg int 'i': " + i);
        Prime prime = new Prime(17);
        System.out.println("Created object from class Prime !" + prime);
    }

    public static void main(String[] args){
        Extends8 ext = new Extends8();
        System.out.println("!!!!!!!!!!!!!! Created object from class Extends8 !" + ext);
        Extends8 ext2 = new Extends8(77);
        System.out.println("!!!!!!!!!!!!!! Created object from class Extends8 !" + ext2);
    } 
	
}

class Prime{

    Prime(int i){
        System.out.println("Call constructor Prime ! args: " + i);
    }
}