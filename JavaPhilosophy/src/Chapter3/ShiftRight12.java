import java.math.BigInteger;

public class ShiftRight12{
	
	public static final int b255 = -0XFF;

    public static void main(String[] args){

        BigInteger bi = BigInteger.valueOf(b255);
        System.out.println("����⠭�: '-255' ��� '-0XFF' ��� 11111111: " + bi);

        String bs = Integer.toBinaryString(b255);
        System.out.println("����⠭� = '-255': " + bs);

        int a = b255 << 1;
        System.out.println("11111111 << ᤢ�� �� ���� ������ �����: " + a);

        int b = a >>> 1;
        System.out.println("11111111 >>> ᤢ�� �� ���� ������ ��ࠢ� ��� ��� �����: " + b);

        int c = b >>> 1;
        System.out.println("11111111 >>> ᤢ�� �� ���� ������ ��ࠢ� ��� ��� �����: " + c);

        int d = c >>> 1;
        System.out.println("11111111 >>> ᤢ�� �� ���� ������ ��ࠢ� ��� ��� �����: " + d);

        int e = d >>> 1;
        System.out.println("11111111 >>> ᤢ�� �� ���� ������ ��ࠢ� ��� ��� �����: " + e);

        int f = e >>> 1;
        System.out.println("11111111 >>> ᤢ�� �� ���� ������ ��ࠢ� ��� ��� �����: " + f);

        int g = f >>> 1;
        System.out.println("11111111 >>> ᤢ�� �� ���� ������ ��ࠢ� ��� ��� �����: " + g);

        int h = g >>> 1;
        System.out.println("11111111 >>> ᤢ�� �� ���� ������ ��ࠢ� ��� ��� �����: " + h);

        int i = h >>> 1;
        System.out.println("11111111 >>> ᤢ�� �� ���� ������ ��ࠢ� ��� ��� �����: " + i);

        int j = i >>> 1;
        System.out.println("11111111 >>> ᤢ�� �� ���� ������ ��ࠢ� ��� ��� �����: " + j);

        int k = i >>> 1;
        System.out.println("11111111 >>> ᤢ�� �� ���� ������ ��ࠢ� ��� ��� �����: " + k);

    }
}