import java.util.*;

public class Animals12
{

    public static void main(String[] args){
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = new ArrayList<>(Arrays.asList(10, 9, 8, 7, 6));

        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);

        ListIterator<Integer> iter1 = list1.listIterator();

        while (iter1.hasNext()){
            System.out.println(iter1.next());
        }
//        iter1 = list1.listIterator(5); - Second option

        while (iter1.hasPrevious()){
            list2.add(iter1.previous());
        }

        System.out.println("list2: " + list2);
    }
}
