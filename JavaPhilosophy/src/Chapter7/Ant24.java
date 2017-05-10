
public class Ant24 extends Insect
{
    private int x = 77;
    protected int y;
    static int x2 = printInit("Field static Ant24.x2 Initialized");

    static int printInit(String s){
        System.out.println(s);
        return 7;
    }

    Ant24(){
        System.out.println("Get constructor Ant24 x = " + x + ", y = " + y);
    }

    public static void main(String[] args){
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);

        System.out.println("x3 = " + RedAnt.x3);

        Insect insect = new Insect();
        System.out.println("j = " + insect.j);
        RedAnt redAnt = new RedAnt();
    }

}

class RedAnt extends Ant24{
    private int a = 77;
    protected int b;
    static int x3 = printInit("Field static RedAnt.x3 Initialized");

    RedAnt(){
        System.out.println("Get constructor RedAnt a = " + a + ", b = " + b);
        j = 88;
    }

    static int printInit(String s){
        System.out.println(s);
        return 99;
    }
}

class Insect{
    private int i = 9;
    protected int j;
    static int x1 = printInit("Field static Insect.x1 Initialized");

    Insect(){
        System.out.println("Get constructor Insect i = " + i + ", j = " + j);
        j = 17;
    }

    static int printInit(String s){
        System.out.println(s);
        return 7;
    }
}