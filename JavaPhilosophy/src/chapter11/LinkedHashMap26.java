import java.util.*;

public class LinkedHashMap26 {
    public static void main(String[] args) {
        Map<String,ArrayList<Integer>> stringMap = new LinkedHashMap<>();
        String str = "Queues are commonly used as a way to reliably transfer\n" +
                "objects from one area of a program to another. Queues are especially important in concurrent\n" +
                "programming, as you will see in the Concurrency chapter, because they safely transfer\n" +
                "objects from one task to another.";
        int num = 0;
        System.out.println(str);
        System.out.println("");

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
        System.out.println("");


        Map<Integer,String> wordsTreeMap = new TreeMap<>();

        for(String word : stringMap.keySet()){
            ArrayList<Integer> integerArrayList = stringMap.get(word);
            for(Integer n : integerArrayList){
                wordsTreeMap.put(n, word);
            }
        }
        System.out.println(wordsTreeMap);
        System.out.println("");

        for(Integer i : wordsTreeMap.keySet()){
            System.out.print(wordsTreeMap.get(i) + " ");
        }
    }
}