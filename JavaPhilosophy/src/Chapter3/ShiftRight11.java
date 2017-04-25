import java.math.BigInteger;

public class ShiftRight11{
	
	public static final int b128 = -0X80;

    public static void main(String[] args){

        BigInteger bi = BigInteger.valueOf(b128);
        System.out.println("����⠭�: -128 ��� -0X80 ��� 10000000: " + bi);

        String bs = Integer.toBinaryString(b128);
        System.out.println("����⠭�3 - 65: " + bs);

        int a = b128 >> 1;
        System.out.println("10000000 >> ᤢ�� �� ���� ������: " + a);

        int b = a >> 1;
        System.out.println("10000000 >> ᤢ�� �� ���� ������: " + b);

        int c = b >> 1;
        System.out.println("10000000 >> ᤢ�� �� ���� ������: " + c);

        int d = c >> 1;
        System.out.println("10000000 >> ᤢ�� �� ���� ������: " + d);

        int e = d >> 1;
        System.out.println("10000000 >> ᤢ�� �� ���� ������: " + e);

        int f = e >> 1;
        System.out.println("10000000 >> ᤢ�� �� ���� ������: " + f);

        int g = f >> 1;
        System.out.println("10000000 >> ᤢ�� �� ���� ������: " + g);

        int h = g >> 1;
        System.out.println("10000000 >> ᤢ�� �� ���� ������: " + h);

    }
}