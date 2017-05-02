

public class ArgumentListOfIndefiniteLength20{	
	
	public static void main(String... args){

        printArray(args);
    }

    static void printArray(String... args){
        for(String str : args){
            System.out.println(str);
        }
    }
	
}