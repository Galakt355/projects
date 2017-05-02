

public class Massivs16{	
				
    public static void main(String[] args){
		
		String[] str = new String[]{
                new String("A"),
        new String("B"),
        "C",
        };

        for(String s : str){
            System.out.println(s);
        }

        for(int i=0; i<3; i++){
            System.out.println(str[i]);
        }
        
    }		
	
}