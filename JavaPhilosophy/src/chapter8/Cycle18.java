public class Cycle18
{

    public static void main(String[] args){

        Cycle18[] cycles = new Cycle18[]{
                new Unicycle(),
                new Bicycle(),
                new Tricycle(),
        };
        cycles[0].balance();
        cycles[1].balance();
        cycles[2].balance();

        ((Unicycle)cycles[0]).balance();
        ((Bicycle)cycles[1]).balance();
        ((Tricycle)cycles[2]).balance();
    }

    void balance(){
        System.out.println("You need a balance !");
    }
}

class Unicycle extends Cycle18{

    void balance(){
        System.out.println("For a unicycle you need a balance !");
    }
}

class Bicycle extends Cycle18{

    void balance(){
        System.out.println("For a bicycle you need a balance !");
    }
}

class Tricycle extends Cycle18{

    void ride(){
        System.out.println("Get method Tricycle.ride() !");
    }
}