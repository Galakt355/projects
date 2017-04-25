public class HexadecimalAndOctal8{
	
	public static void main(String[] args){
        long valFloat = 0X4C5;
        long valDouble = 02305;

        System.out.println("16-ое 0X4C5: " + valFloat);
        System.out.println("8-ое представление 02305: " + valDouble);

        System.out.println("0X4C5 в двоичном формате: " + Long.toBinaryString(valFloat));
        System.out.println("02305 в двоичном формате: " + Long.toBinaryString(valDouble));

    }
}