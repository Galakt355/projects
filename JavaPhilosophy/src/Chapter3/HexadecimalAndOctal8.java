public class HexadecimalAndOctal8{
	
	public static void main(String[] args){
        long valFloat = 0X4C5;
        long valDouble = 02305;

        System.out.println("16-�� 0X4C5: " + valFloat);
        System.out.println("8-�� �।�⠢����� 02305: " + valDouble);

        System.out.println("0X4C5 � ����筮� �ଠ�: " + Long.toBinaryString(valFloat));
        System.out.println("02305 � ����筮� �ଠ�: " + Long.toBinaryString(valDouble));

    }
}