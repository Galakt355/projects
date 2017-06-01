import java.util.*;

public class Generator4{
    static List<String> personageNames = new ArrayList<String>(Arrays.asList("Darth Vader", "Luke Skywalker", "Padme Amidala", "Han Solo", "Mace Windu", "Obi-Wan Kenobi", "Yoda"));

    static int numberName;
    public static void main(String[] args){
        String[] stringsMassif = new String[10];
        List<String> arrayList = new ArrayList<String>();
        List<String> linkedList = new LinkedList<String>();
        Set<String> hashSet = new HashSet<String>();
        Set<String> linkedHashSet = new LinkedHashSet<String>();
        Set<String> treeSet = new TreeSet<String>();

        for(int i=0; i<10; i++){
            stringsMassif[i] = next();
            arrayList.add(next());
            linkedList.add(next());
            hashSet.add(next());
            linkedHashSet.add(next());
            treeSet.add(next());
        }

		System.out.println("");
        System.out.println("Get stringsMassif !");
        for(String str: stringsMassif){
            System.out.println(str);
        }

        System.out.println("");
        System.out.println("Get arrayList !");
        for(String str: arrayList){
            System.out.println(str);
        }

        System.out.println("");
        System.out.println("Get linkedList !");
        for(String str: linkedList){
            System.out.println(str);
        }

        System.out.println("");
        System.out.println("Get hashSet !");
        for(String str: hashSet){
            System.out.println(str);
        }

        System.out.println("");
        System.out.println("Get linkedHashSet !");
        for(String str: linkedHashSet){
            System.out.println(str);
        }

        System.out.println("");
        System.out.println("Get treeSet !");
        for(String str: treeSet){
            System.out.println(str);
        }
    }

    static String next(){
        if (numberName >= personageNames.size()) numberName = 0;
        return personageNames.get(numberName++);
    }
}