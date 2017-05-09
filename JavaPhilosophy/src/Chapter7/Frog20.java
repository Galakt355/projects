class Amphibian{

    void go(Amphibian am){
        System.out.println("Amphibian go() ! " + am.getClass());
    }
}

public class Frog20 extends Amphibian{

    @Override
    final void go(Amphibian am){
        System.out.println("Frog20 Override go() ! " + am.getClass());
    }

    public static void main(String[] args){
        Frog20 frog = new Frog20();
        frog.go(frog);
    }
}