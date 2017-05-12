public class ReferenceCounting15
{
    public static void main(String[] args){
        Composing[] composing = {
                new Composing(new Rodent()),
                new Composing(new Mouse()),
                new Composing(new Hamster()),
                new Composing(new Jerboa()),
                new Composing(new Rodent()),
        };

        for(Composing c : composing){
            c.dispose();
        }
    }
}

class Rodent{
    private int referenceCount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Rodent(){
        System.out.println("Generation: " + this);
    }

    public void addRef(){
        System.out.println("Reference: " + this);
        referenceCount++;
    }

    protected void dispose(){
        if (--referenceCount == 0){
            System.out.println("Disposing " + this);
        }
    }

    public String toString(){
        return "Rodent " + id;
    }
}

class Mouse extends Rodent{
    Mouse(){
        System.out.println("Generation Mouse()");
    }
}

class Hamster extends Rodent{
    Hamster(){
        System.out.println("Generation Hamster()");
    }
}

class Jerboa extends Rodent{
    Jerboa(){
        System.out.println("Generation Jerboa()");
    }
}

class Composing{
    private Rodent rodent;
    private static long counter = 0;
    private final long id = counter++;

    public Composing(Rodent rodent){
        System.out.println("Generation: " + this);
        this.rodent = rodent;
        this.rodent.addRef();
    }

    protected void dispose(){
        System.out.println("disposing " + this);
        rodent.dispose();
    }

    public String toString(){
        return "Composing " + id;
    }
}