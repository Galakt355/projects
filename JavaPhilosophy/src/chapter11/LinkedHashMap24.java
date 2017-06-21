import java.util.*;

public class LinkedHashMap24 {
    public static void main(String[] args) {
        Map<String,String> stringMap = new LinkedHashMap<>();
        Map<String,String> stringTreeMap = new TreeMap<>();
        List<String> stringList = new LinkedList<>();
        String str = "C D F E a A R B b";

        Collections.addAll(stringList, str.split(" "));

        for(String s : stringList){
            stringMap.put(s, s);
        }
        System.out.println(stringMap);

        stringTreeMap.putAll(stringMap);

        System.out.println(stringTreeMap);
    }
}