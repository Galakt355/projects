import java.util.*;

public class HelloWorldATypeName{
	public static void main(String[] args){		
		ATypeName aTypeName = new ATypeName();
		aTypeName.Metod();
	}
	
	static class ATypeName{
		public void Metod(){
			System.out.println("Я стою на пороге Вселенной,");
		}		
	}
}