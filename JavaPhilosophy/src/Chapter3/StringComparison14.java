

public class StringComparison14{
	
	
    public static void main(String[] args){
		
		String str1 = new String("Привет!");
		String str2 = "Пока!";
		String str3 = new String("Привет!");
		String str4 = "Пока!";
		
		metod(str1, str2);		
		metod(str1, str3);		
		metod(str2, str4);		
		
    }
	
	public static void metod(String s, String s2){
		System.out.print("строка: " + s + " соответствует " + "строке: " + s2 + " - ");
		System.out.println(s.equals(s2));
        System.out.print("строка: " + s + " равна по ссылке " + "строке: " + s2 + " - ");
        System.out.println(s == s2);
        System.out.print("строка: " + s + " неровна по ссылке " + "строке: " + s2 + " - ");
        System.out.println(s != s2);
		
	}
}