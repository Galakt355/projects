import java.util.*;

public class LinkedList14{
    public static void main(String[] args)
    {
        Random rand = new Random();

        List<Integer> integerLinkedList = new LinkedList<>();
        for(int i=0; i<10000; i++){
            integerLinkedList.add(i);
        }
        System.out.println(integerLinkedList);

        ListIterator listIterator = integerLinkedList.listIterator(5000);

        List<Integer> integerLinkedListAdd = new LinkedList<>();
        for(int i=0; i<100; i++){
            integerLinkedListAdd.add(rand.nextInt());
        }
        ListIterator listIteratorAdd = integerLinkedListAdd.listIterator();

        while (listIteratorAdd.hasNext()){
            listIterator.add(listIteratorAdd.next());
        }

        System.out.println(integerLinkedList);
    }
}