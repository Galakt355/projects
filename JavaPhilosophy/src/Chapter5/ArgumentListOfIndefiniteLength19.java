

public class ArgumentListOfIndefiniteLength19{	
	
	public static void main(String[] args){
						
		String[] str = new String[]{
                new String("Go go go"),
                new String("Go go go !"),
                "Go go go ! ! !",
        };
		
		printArray("Aaaaa", "Uuuuu");
		printArray(str);
		printArray(new String[]{"A", "B", "C"});
        
    }
	
	static void printArray(String... args){
        for(String str : args){
            System.out.println(str);
        }
    }	
	
}