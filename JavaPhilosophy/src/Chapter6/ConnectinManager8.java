import mypackage.*;

public class ConnectinManager8{	
	
	public static void main(String[] args){
        Connection[] connections = new Connection[]{
                testStatic(),
                testStatic(),
                testStatic(),
        };

        for(Connection con : connections){
            System.out.println(con.s);
        }
    }

    static Connection testStatic(){
        Connection connection = Connection.makeConnectin();
        return connection;
    }	
	  
}