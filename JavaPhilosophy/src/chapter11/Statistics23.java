import java.util.*;

public class Statistics23 {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Map<Integer,Integer> m = new TreeMap<>();
        Map<Integer,Integer> mNew = new TreeMap<>();
        TreeSet<Integer> integerSet = new TreeSet<>();
        int num =0;

        for(int x = 0; x < 1000; x++){
            for(int i = 0; i < 10000; i++) {
                int r = rand.nextInt(20);
                Integer freq = m.get(r);
                m.put(r, freq == null ? 1 : freq + 1);
            }

            integerSet.addAll(m.values());
            System.out.println(integerSet);
            Integer lastElement = integerSet.last();

            for(Map.Entry<Integer, Integer> value : m.entrySet()){
                if (lastElement == value.getValue()){
                    mNew.put(value.getKey(), num++);
                }
            }

            integerSet.clear();
            m.clear();
        }

        System.out.println(mNew);
    }
}