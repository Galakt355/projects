class Amphibian{

    static void run(Amphibian am){
        System.out.println("Amphibian run() ! " + am.getClass());
    }
	
	void go(Amphibian am){
        System.out.println("Amphibian go() ! " + am.getClass());
    }
}

public class Frog17 extends Amphibian{

    @Override
    void go(Amphibian am){
        System.out.println("Frog17 Override go() ! " + am.getClass());
    }

    public static void main(String[] args){
        Frog17 frog = new Frog17();
        Amphibian.run(frog);
        frog.go(frog);
    }
}