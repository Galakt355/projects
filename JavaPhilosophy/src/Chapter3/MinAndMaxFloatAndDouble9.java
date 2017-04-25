import java.math.BigDecimal;

public class MinAndMaxFloatAndDouble9{
		
	public static void main(String[] args){
		float minFloat = -3.4e38f;
        float maxFloat = 3.4e38f;
        double minDouble = -1.7e308;
        double maxDouble = 1.7e308;

        System.out.println("min Float: " + minFloat);
        System.out.println("max Float: " + maxFloat);
        System.out.println("min Double: " + minDouble);
        System.out.println("max Double: " + maxDouble);

        BigDecimal bd = BigDecimal.valueOf(minFloat);
        BigDecimal bd2 = BigDecimal.valueOf(maxFloat);
        BigDecimal bd3 = BigDecimal.valueOf(minDouble);
        BigDecimal bd4 = BigDecimal.valueOf(maxDouble);

        System.out.println("min Float: " + bd);
        System.out.println("max Float: " + bd2);
        System.out.println("min Double: " + bd3);
        System.out.println("max Double: " + bd4);
	}	
		
}