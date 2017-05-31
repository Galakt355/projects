import java.util.*;

public class SimpleColletion2{
    public static void main(String[] args)
    {
        Set<Integer> integerCollection = new TreeSet<Integer>();
        for(int i=0; i<10; i++){
            integerCollection.add(i);
        }
        for(Integer i : integerCollection){
            System.out.println(i);
        }
    }
}