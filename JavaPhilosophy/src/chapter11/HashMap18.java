import java.util.*;

public class HashMap18{
    int gerbilNumber;

    void hop(){
        System.out.println("Get gerbilNumber ! " + gerbilNumber);
    }

    public static void main(String[] args){
        Random random = new Random();

        Map<Integer, Long> collectionLinkedHashMap = new LinkedHashMap<Integer, Long>();

        for(int i = 5; i > 0; i--){
            collectionLinkedHashMap.put(i, random.nextLong());
        }
        System.out.println("LinkedHashMap: " + collectionLinkedHashMap);

        /**
         * TreeMap automatically sorts by key
         */
        Map<Integer, Long> collectionTreeMap = new TreeMap<Integer, Long>();
        collectionTreeMap.putAll(collectionLinkedHashMap);
        System.out.println("TreeMap automatically sorts by key. TreeMap from LinkedHashMap: " + collectionTreeMap);

        Map<Integer, Long> collectionHashMap = new HashMap<Integer, Long>();

        for(int i = 5; i > 0; i--){
            collectionHashMap.put(i, random.nextLong());
        }
        System.out.println("HashMap ordered by hash code: " + collectionHashMap);

        Map<Integer, Long> collectionHashMap2 = new LinkedHashMap<Integer, Long>();
        collectionHashMap2.put(3, collectionTreeMap.get(3));
        collectionHashMap2.put(2, collectionTreeMap.get(2));
        collectionHashMap2.put(4, collectionTreeMap.get(4));
        System.out.println("LinkedHashMap stores in order of insertion: " + collectionHashMap2);
    }
}