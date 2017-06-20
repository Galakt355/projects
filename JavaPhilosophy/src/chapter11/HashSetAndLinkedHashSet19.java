import java.util.*;

public class HashSetAndLinkedHashSet19{

    public static void main(String[] args){
        Random random = new Random();

        Map<Integer, Long> collectionLinkedHashMap = new LinkedHashMap<Integer, Long>();

        for(int i = 10; i > 0; i--){
            collectionLinkedHashMap.put(i, random.nextLong());
        }
        collectionLinkedHashMap.put(13, random.nextLong());
        collectionLinkedHashMap.put(0, random.nextLong());
        System.out.println("LinkedHashMap: " + collectionLinkedHashMap);

        Map<Integer, Long> collectionTreeMap = new TreeMap<>();
        collectionTreeMap.putAll(collectionLinkedHashMap);
        System.out.println("TreeMap ordered by Key: " + collectionTreeMap);

        /**
         * TreeSet automatically sorts
         */
        Set<Integer> collectionHashSetKey = new TreeSet<>();
        collectionHashSetKey.addAll(collectionLinkedHashMap.keySet());
        System.out.println("keySet() automatically sorts by key. collectionHashSetKey from LinkedHashMap: " + collectionHashSetKey);

        Map<Integer, Long> collectionHashMap1 = new HashMap<>();
        for(Integer key : collectionHashSetKey){
            collectionHashMap1.put(key, collectionLinkedHashMap.get(key));
        }
        System.out.println("HashMap ordered by Key: " + collectionHashMap1);

        Map<Integer, Long> collectionLinkedHashMap2 = new LinkedHashMap<>();
        for(Integer key : collectionHashSetKey){
            collectionLinkedHashMap2.put(key, collectionLinkedHashMap.get(key));
        }
        System.out.println("LinkedHashMap ordered by Key: " + collectionLinkedHashMap2);


        Set<Long> collectionHashSet = new HashSet<>();
        for(Integer key : collectionHashSetKey){
            collectionHashSet.add(collectionLinkedHashMap.get(key));
        }
        System.out.println("HashSet ordered by Key: " + collectionHashSet);


        Set<Long> collectionLinkedHashSet = new LinkedHashSet<>();
        for(Integer key : collectionHashSetKey){
            collectionLinkedHashSet.add(collectionLinkedHashMap.get(key));
        }
        System.out.println("LinkedHashSet ordered by Key: " + collectionLinkedHashSet);
    }
}