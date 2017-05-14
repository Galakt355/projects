public abstract class Starship4_2
{
    public static void main(String[] args){
        CruiserOfEmpire cruiserOfEmpire =  new CruiserOfEmpire();
        cruiserOfEmpire.fire(new CruiserOfEmpire());
    }

    abstract void fire(Starship4_2 starship);
}

class CruiserOfEmpire extends Starship4_2{

    void fire(Starship4_2 starship){
        System.out.println("The cruiser of the empire opened fire ! " );
        starship.fire(starship);
    }
}