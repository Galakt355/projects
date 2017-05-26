import java.util.ArrayList;

interface U
{
    void end();

    void current();

    void next();
}

class A{
    public U getU(final int i){
        return new U(){
            public void end(){
                System.out.println("Method 'end' !" + i);
            }

            public void current(){
                System.out.println("Method 'current' !" + i);
            }

            public void next(){
                System.out.println("Method 'next' !" + i);
            }
        };
    }
}

class B{
    private ArrayList<U> arrayU = new ArrayList<>();

    public void saveU(U u){
        arrayU.add(u);
    }

    public void removeU(U u){
        arrayU.remove(u);
    }

    public U getArrayElementU(int i){
        return arrayU.get(i);
    }

    public void iterate(){
        for(U element : arrayU){
            element.current();
            element.next();
            element.end();
        }
    }

}

public class Program21{
    public static void main(String[] args)
    {
        A a = new A();
        A a2 = new A();
        A a3 = new A();

        B b = new B();
        b.saveU(a.getU(1));
        b.saveU(a2.getU(2));
        b.saveU(a3.getU(3));

        b.iterate();

        b.removeU(b.getArrayElementU(0));
        b.removeU(b.getArrayElementU(0));

        b.iterate();
    }

}