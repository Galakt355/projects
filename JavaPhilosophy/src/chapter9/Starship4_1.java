public abstract class Starship4_1
{
    static Starship4_1 st;

    public static void main(String[] args){
        CruiserOfEmpire.fire(st);
    }
}

abstract class CruiserOfEmpire extends Starship4_1{

    static void fire(Starship4_1 starship){
        System.out.println("The cruiser of the empire opened fire ! " );
        ((CruiserOfEmpire) starship).fire(starship);
    }
}