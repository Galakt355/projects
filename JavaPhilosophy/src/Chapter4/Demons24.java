import java.util.Scanner;

public class Demons24{	
		
    public static void main(String[] args){
		
		int x1000, x100, x10, x1;

        for (int i = 1000; i < 10000; i++){

            x1000 = i / 1000;
            x100 = i % 1000 / 100;
            x10 = i % 100 / 10;
            x1 = i % 10;

            String s1 = Integer.toString(x1000);
            String s2 = Integer.toString(x100);
            String s3 = Integer.toString(x10);
            String s4 = Integer.toString(x1);

            int d1 = Integer.parseInt(s1 + s2);
            int d2 = Integer.parseInt(s1 + s3);
            int d3 = Integer.parseInt(s1 + s4);

            int d4 = Integer.parseInt(s2 + s1);
            int d5 = Integer.parseInt(s2 + s3);
            int d6 = Integer.parseInt(s2 + s4);

            int d7 = Integer.parseInt(s3 + s1);
            int d8 = Integer.parseInt(s3 + s2);
            int d9 = Integer.parseInt(s3 + s4);

            int d10 = Integer.parseInt(s4 + s1);
            int d11 = Integer.parseInt(s4 + s2);
            int d12 = Integer.parseInt(s4 + s3);
            
            if(d1 * d9 == i)					
                System.out.println(i);			

            if(d1 * d12 == i)
                System.out.println(i);

            if(d2 * d6 == i)
                System.out.println(i);

            if(d2 * d11 == i)
                System.out.println(i);

            if(d3 * d5 == i)
                System.out.println(i);

            if(d3 * d8 == i)
                System.out.println(i);

            if(d4 * d9 == i)
                System.out.println(i);

            if(d4 * d12 == i)
                System.out.println(i);

            if(d5 * d10 == i)
                System.out.println(i);

            if(d6 * d7 == i)
                System.out.println(i);

            if(d7 * d12 == i)
                System.out.println(i);

            if(d8 * d10 == i)
                System.out.println(i);
        }		
		
    }	
	
}