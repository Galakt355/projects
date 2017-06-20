import java.util.*;

public class UniqueWords21{
    static int wordCount;
    static int vowelCountAll;
    static Map<String, Integer> numberIdenticalVowelsMap = new TreeMap<>();
    static Map<String, Integer> numberIdenticalWordsMap = new TreeMap<String, Integer>(String.CASE_INSENSITIVE_ORDER);

    public static void main(String[] args)
    {
        String str = "The people always dreamed about space travelling and flying to different stars.";
        System.out.println(str);

        Set<String> collectionSet = new LinkedHashSet<>();
        Collections.addAll(collectionSet, str.split(" "));
        Iterator iterator = collectionSet.iterator();
        while (iterator.hasNext()){
            String word = (String) iterator.next();
            Integer numberIdenticalVowels = numberIdenticalWordsMap.get(word);
            numberIdenticalWordsMap.put(word, numberIdenticalVowels == null ? 1 : numberIdenticalVowels + 1);
        }
        System.out.println(collectionSet);

        Iterator<String> iteratorSet = collectionSet.iterator();
        while(iteratorSet.hasNext()){
            numberVowelsInWord(iteratorSet.next());
        }

        System.out.println("Vowel counter all: " + vowelCountAll);

        System.out.println(numberIdenticalVowelsMap);

        System.out.println(numberIdenticalWordsMap);
    }

    static void numberVowelsInWord(String s){
        int vowelCounter = 0;

        Set<String> collectionVowels = new HashSet<String>(Arrays.asList("A", "a", "E", "e", "I", "i", "O", "o", "U", "u", "Y", "y"));
        char[] stringCollection = s.toCharArray();
        List<String> collectionLettersFromWord = new ArrayList<String>();
        for(char c: stringCollection){
            collectionLettersFromWord.add(String.valueOf(c));
        }
        System.out.println(collectionLettersFromWord);

        for(String letter: collectionLettersFromWord){

            if (collectionVowels.contains(letter)){
                vowelCounter++;
                vowelCountAll++;

                Integer numberIdenticalVowels = numberIdenticalVowelsMap.get(letter);
                numberIdenticalVowelsMap.put(letter, numberIdenticalVowels == null ? 1 : numberIdenticalVowels + 1);
            }
        }

        System.out.println("Word number " + ++wordCount + " vowel counter: " + vowelCounter);
    }
}