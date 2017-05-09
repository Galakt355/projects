class Amphibian{

    final void go(Amphibian am){
        System.out.println("Amphibian go() ! " + am.getClass());
    }
}

public class Frog21 extends Amphibian{

    @Override
    void go(Amphibian am){
        System.out.println("Frog16 Override go() ! " + am.getClass());
    }

    public static void main(String[] args){
        Frog21 frog = new Frog21();
        frog.go(frog);
    }
}