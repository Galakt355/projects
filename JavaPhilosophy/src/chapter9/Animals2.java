public class Animals2
{
    public static void main(String[] args){
        Rodent rodent = new Rodent();
    }
}

abstract class Rodent{
    void eat(){
        System.out.println("Rodent.eat()");
    }
}