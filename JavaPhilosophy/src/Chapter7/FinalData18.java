import java.util.Random;

public class FinalData18{
private static Random rand = new Random(50);
private final int intFinal = rand.nextInt(20);
private static final int intStaticFinal = rand.nextInt(20);
private static int intStatic = rand.nextInt(20);
	
	public static void main(String[] args){
	System.out.println("intStatic = " + intStatic);
	
        FinalData18 fd1 = new FinalData18();
        FinalData18 fd2 = new FinalData18();
        System.out.println(fd1);
		System.out.println(fd2);
    }
	
	public String toString(){
	return "intFinal = " + intFinal + ", intStaticFinal = " + intStaticFinal + ", intStatic = " + intStatic;
	}
}