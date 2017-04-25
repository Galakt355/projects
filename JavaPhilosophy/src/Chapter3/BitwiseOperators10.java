public class BitwiseOperators10{
	public static final byte b65 = (byte) 01010101;
    public static final byte b18 = (byte) 10101010;

    public static void main(String[] args){

        String strB = Byte.toString(b65);
        String strB2 = Byte.toString(b18);

        System.out.println("Константа1 - 65 или 01010101: " + strB);
        System.out.println("Константа2 - 18 или 10101010: " + strB2);

        int a = b65 & b18;
        System.out.println("01010101 & 10101010: " + a);

        int b = b65 | b18;
        System.out.println("01010101 | 10101010: " + b);

        int c = b65 ^ b18;
        System.out.println("01010101 ^ 10101010: " + c);

        int d = ~b65;
        System.out.println("~01010101: " + d);

        int e = ~b18;
        System.out.println("~10101010: " + e);

        int f = b65 << b18;
        System.out.println("01010101 << 10101010: " + f);

        int g = b65 >> b18;
        System.out.println("01010101 >> 10101010: " + g);

        int h = b65 >>> b18;
        System.out.println("01010101 >>> 10101010: " + h);

    }
}