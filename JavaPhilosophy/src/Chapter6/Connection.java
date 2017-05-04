

public class Connection{
	
	String s;

    private Connection(){
        s = "Connection !";
    }

    public static Connection makeConnectin(){
        return new Connection();
    }
	
}