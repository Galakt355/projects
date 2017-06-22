import java.util.*;

public class LinkedHashMap25 {
    public static void main(String[] args) {
        Map<String,ArrayList<Integer>> stringMap = new LinkedHashMap<>();
        String str = "Queues are commonly used as a way to reliably transfer\n" +
                "objects from one area of a program to another. Queues are especially important in concurrent\n" +
                "programming, as you will see in the Concurrency chapter, because they safely transfer\n" +
                "objects from one task to another.";
        int num = 0;

        for(String word : str.split(" ")){
            Integer wordNum = num++;
            ArrayList<Integer> integerArrayList = stringMap.get(word);
            if (integerArrayList == null){
                ArrayList<Integer> list = new ArrayList<>();
                list.add(wordNum);
                stringMap.put(word, list);
            }
            else {
                integerArrayList.add(wordNum);
                stringMap.put(word, integerArrayList);
            }
        }

        System.out.println(stringMap);
    }
}