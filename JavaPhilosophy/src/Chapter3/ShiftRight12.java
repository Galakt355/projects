import java.math.BigInteger;

public class ShiftRight12{
	
	public static final int b255 = -0XFF;

    public static void main(String[] args){

        BigInteger bi = BigInteger.valueOf(b255);
        System.out.println("Константа: '-255' или '-0XFF' или 11111111: " + bi);

        String bs = Integer.toBinaryString(b255);
        System.out.println("Константа = '-255': " + bs);

        int a = b255 << 1;
        System.out.println("11111111 << сдвиг на одну позицию влево: " + a);

        int b = a >>> 1;
        System.out.println("11111111 >>> сдвиг на одну позицию вправо без учета знака: " + b);

        int c = b >>> 1;
        System.out.println("11111111 >>> сдвиг на одну позицию вправо без учета знака: " + c);

        int d = c >>> 1;
        System.out.println("11111111 >>> сдвиг на одну позицию вправо без учета знака: " + d);

        int e = d >>> 1;
        System.out.println("11111111 >>> сдвиг на одну позицию вправо без учета знака: " + e);

        int f = e >>> 1;
        System.out.println("11111111 >>> сдвиг на одну позицию вправо без учета знака: " + f);

        int g = f >>> 1;
        System.out.println("11111111 >>> сдвиг на одну позицию вправо без учета знака: " + g);

        int h = g >>> 1;
        System.out.println("11111111 >>> сдвиг на одну позицию вправо без учета знака: " + h);

        int i = h >>> 1;
        System.out.println("11111111 >>> сдвиг на одну позицию вправо без учета знака: " + i);

        int j = i >>> 1;
        System.out.println("11111111 >>> сдвиг на одну позицию вправо без учета знака: " + j);

        int k = i >>> 1;
        System.out.println("11111111 >>> сдвиг на одну позицию вправо без учета знака: " + k);

    }
}