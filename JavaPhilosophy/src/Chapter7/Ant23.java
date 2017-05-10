
public final class Ant23 extends Insect
{
	static int x2 = printInit("Field static Ant23.x2 Initialized");
	
	static int printInit(String s){
		System.out.println(s);
		return 7;
	}
	
    public static void main(String[] args){
		System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
        
        Ant23 ant = new Ant23();
        System.out.println("j = " + ant.j);   
    }

}

class Insect{
	private int i = 9;
    protected int j;
	static int x1 = printInit("Field static Insect.x1 Initialized");
	
	Insect(){
        System.out.println("i = " + i + ", j = " + j);
        j = 17;
    }
	
	static int printInit(String s){
		System.out.println(s);
		return 7;
	}
}