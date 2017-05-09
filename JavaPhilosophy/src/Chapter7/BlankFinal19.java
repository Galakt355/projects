import java.util.Random;

public class BlankFinal19{

final Poppet poppet;

public BlankFinal19(){
poppet = new Poppet();
}
	
	public static void main(String[] args){
	BlankFinal19 blankFinal = new BlankFinal19();
	BlankFinal19 blankFinal2 = new BlankFinal19();
	System.out.println(blankFinal);
	System.out.println(blankFinal2);
	
	blankFinal.poppet = new BlankFinal19();
    }
}

class Poppet{
}