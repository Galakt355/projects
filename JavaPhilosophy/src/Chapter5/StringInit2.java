

public class StringInit2{
	
	private String s;	
	private String str2 = "Другая строка!";
		
    public static void main(String[] args){
		
		String1 str = new String1();
        str.metod();
		
    }	
	
	StringInit2(){
        s = str2;
        System.out.println(s);
    }

    void metod(){
        s = "Первая строка";
        System.out.println(s);
    }
	
}