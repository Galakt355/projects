import java.math.BigInteger;

public class ShiftRight11{
	
	public static final int b128 = -0X80;

    public static void main(String[] args){

        BigInteger bi = BigInteger.valueOf(b128);
        System.out.println("Константа: -128 или -0X80 или 10000000: " + bi);

        String bs = Integer.toBinaryString(b128);
        System.out.println("Константа3 - 65: " + bs);

        int a = b128 >> 1;
        System.out.println("10000000 >> сдвиг на одну позицию: " + a);

        int b = a >> 1;
        System.out.println("10000000 >> сдвиг на одну позицию: " + b);

        int c = b >> 1;
        System.out.println("10000000 >> сдвиг на одну позицию: " + c);

        int d = c >> 1;
        System.out.println("10000000 >> сдвиг на одну позицию: " + d);

        int e = d >> 1;
        System.out.println("10000000 >> сдвиг на одну позицию: " + e);

        int f = e >> 1;
        System.out.println("10000000 >> сдвиг на одну позицию: " + f);

        int g = f >> 1;
        System.out.println("10000000 >> сдвиг на одну позицию: " + g);

        int h = g >> 1;
        System.out.println("10000000 >> сдвиг на одну позицию: " + h);

    }
}