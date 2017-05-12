import java.util.ArrayList;

public class ReferenceCounting14
{
    public static void main(String[] args){
        ArrayList<Composing> listComposing = new ArrayList<Composing>();

        for(int i=0; i<90; i++){
            new Shared();
            listComposing.add(new Composing(new Shared()));
            System.gc();
        }

        for(Composing c : listComposing){
            c.dispose();
        }
    }
}

class Shared{
    boolean checkedOut = false;
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;
    char[] tmp = new char[10000000];

    public Shared(){
        System.out.println("Generation: " + this + " !!!");
        try
        {
            Thread.sleep(10);
        }
        catch (Throwable tr)
        {
        }
    }

    protected void finalize() throws Throwable {
        if (!checkedOut){
            System.out.println("Object Shared no finalize !!!!!!!");
        }
        System.out.println("Object Shared finalize !");
    }

    public void addRef(){
        refcount++;
    }

    protected void dispose(){
        if (--refcount == 0){
            System.out.println("Disposing " + this);
            checkedOut = true;
        }
    }

    public String toString(){
        return "Shared " + id;
    }
}

class Composing{
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;

    public Composing(Shared shared){
        System.out.println("Generation: " + this);
        this.shared = shared;
        this.shared.addRef();
    }

    protected void dispose(){
        System.out.println("disposing " + this);
        shared.dispose();
    }

    public String toString(){
        return "Composing " + id;
    }
}