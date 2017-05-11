public class Animals12
{
    Animals12(){
        System.out.println("Generation Animals12()");
    }

    public static void main(String[] args){
        Mouse mouse = new Mouse();
    }

}

class Rodent extends Animals12{

    Rodent(){
        System.out.println("Generation Rodent()");
    }
}

class Mouse extends Rodent{
    Hamster hamster = new Hamster();

    Mouse(){
        System.out.println("Generation Mouse()");
    }
}

class Hamster extends Rodent{

    Hamster(){
        System.out.println("Generation Hamster()");
    }
}