import java.util.*;

public class Sequence9
{
    static int n = 1;

    public static void main(String[] args){
        List<Inner> sequenceElement = new ArrayList<>();
        for (int i = 0; i < 7; i++)
        {
            String str = "'Inner' it should be static to use from 'main' !" + " Object number " + n++;
            sequenceElement.add(new Inner(str));

        }
        System.out.println(sequenceElement);

        Iterator<Inner> sequenceIterator = sequenceElement.iterator();
        while (sequenceIterator.hasNext())
        {
            System.out.println(sequenceIterator.next());
        }
    }

    static class Inner{
        String s;

        Inner(String str){
            s = str;
        }

        @Override
        public String toString(){
            return s;
        }
    }
}