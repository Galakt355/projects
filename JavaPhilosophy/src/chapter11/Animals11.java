import java.util.*;

public class Animals11
{

    public static void main(String[] args){
        Collection<Animal> arrayListCol = new ArrayList<>(Arrays.asList(new Animal("Owl"), new Animal("Wolf"), new Animal("Bear")));
        System.out.println("Get ArrayList !");
        iterationCollection(arrayListCol);

        Collection<Animal> linkedListCol = new LinkedList<>(arrayListCol);
        System.out.println("Get LinkedList !");
        iterationCollection(linkedListCol);

        Collection<Animal> hashSetCol = new HashSet<>(arrayListCol);
        System.out.println("Get HashSet !");
        iterationCollection(hashSetCol);

        Collection<Animal> linkedHashSetCol = new LinkedHashSet<>(arrayListCol);
        System.out.println("Get LinkedHashSet !");
        iterationCollection(linkedHashSetCol);

        System.out.println("arrayListCol: " + arrayListCol);
        Collection treeSetCol = new TreeSet<>(arrayListCol);
        System.out.println("Get TreeSet !");
        System.out.println(treeSetCol);
        iterationCollection(treeSetCol);
    }

    static void iterationCollection(Collection col){
        Iterator<Animal> iterator = col.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}

class Animal implements Comparable
{
    String s;

    public Animal(String str){
        s = str;
    }

    public String toString(){
        return s;
    }

    @Override
    public int compareTo(Object o)
    {
        if (this.equals(0)){
            return 1;
        }
        return 0;
    }
}