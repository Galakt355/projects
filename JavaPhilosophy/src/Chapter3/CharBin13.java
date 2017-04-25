import java.math.BigInteger;

public class CharBin13{
	
	public static final char a = 'Й';
	public static final char k = 'Ё';

    public static void main(String[] args){
		
		System.out.println("Русская буква 'Й' код символа: " + (int)a);
		System.out.println("Русская буква 'Й': в двоичном формате: " + Integer.toBinaryString(a));
		System.out.println("Русская буква 'Ё' код символа: " + (int)k);		
		System.out.println("Русская буква 'Ё': в двоичном формате: " + Integer.toBinaryString(k));
		
    }
}