

public class StringComparison14{
	
	
    public static void main(String[] args){
		
		String str1 = new String("�ਢ��!");
		String str2 = "����!";
		String str3 = new String("�ਢ��!");
		String str4 = "����!";
		
		metod(str1, str2);		
		metod(str1, str3);		
		metod(str2, str4);		
		
    }
	
	public static void metod(String s, String s2){
		System.out.print("��ப�: " + s + " ᮮ⢥����� " + "��ப�: " + s2 + " - ");
		System.out.println(s.equals(s2));
        System.out.print("��ப�: " + s + " ࠢ�� �� ��뫪� " + "��ப�: " + s2 + " - ");
        System.out.println(s == s2);
        System.out.print("��ப�: " + s + " ��஢�� �� ��뫪� " + "��ப�: " + s2 + " - ");
        System.out.println(s != s2);
		
	}
}