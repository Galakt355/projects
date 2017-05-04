

public class DelayedInitialization1{
	
	private Connection con;

    public static void main(String[] args){

        DelayedInitialization1 obj = new DelayedInitialization1();
        System.out.println(obj.initConnection());
        System.out.println(obj.initConnection().getClass());
        System.out.println(obj.initConnection().s);

    }

    public Connection initConnection(){
        con = new Connection();
        con.s = "Delayed initialization Connection and 's' from Connection !";
        return con;
    }
	
}

class Connection{	
	String s;
}