import mypackage.*;

public class AccessLevels6{
	
	protected static String protect = "protected protect !";
	static String pack = "package pack !";
	private static String priv = "private priv !";
	
	public static void main(String[] args){
        TestNew.metod();
    }	
	
	public static String getPriv()
    {
        return priv;
    }    
}

class TestNew
{

    static void metod(){
        System.out.println(AccessLevels6.protect);
        System.out.println(AccessLevels6.pack);
        System.out.println(AccessLevels6.getPriv());
    }

}

