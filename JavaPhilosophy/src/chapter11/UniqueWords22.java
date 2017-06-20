import net.ContainerForWord;

import java.util.*;

public class UniqueWords22{
    static int wordCount;
    static int vowelCountAll;
    static Map<String, Integer> numberIdenticalVowelsMap = new TreeMap<>();
    static Map<String, Integer> numberIdenticalWordsMap = new TreeMap<String, Integer>(String.CASE_INSENSITIVE_ORDER);

    public static void main(String[] args)
    {
        String str = "The people always dreamed about space travelling and flying to different stars The .";
        System.out.println(str);

        List<String> listWords = new ArrayList<>();
        Collections.addAll(listWords, str.split(" "));

        Set<ContainerForWord> collectionSet = new LinkedHashSet<>();
        for(String s : listWords){
            collectionSet.add(new ContainerForWord(s));
        }

        for(ContainerForWord wordContainer : collectionSet){
            Integer numberIdenticalVowels = numberIdenticalWordsMap.get(wordContainer.getName());
            numberIdenticalWordsMap.put(wordContainer.getName(), numberIdenticalVowels == null ? 1 : numberIdenticalVowels + 1);
            wordContainer.setNumberOfRepetitions(numberIdenticalWordsMap.get(wordContainer.getName()));
        }

        System.out.println(collectionSet);

        Iterator<ContainerForWord> iteratorSet = collectionSet.iterator();
        while(iteratorSet.hasNext()){
            numberVowelsInWord(iteratorSet.next());
        }

        System.out.println("Vowel counter all: " + vowelCountAll);

        System.out.println(numberIdenticalVowelsMap);

        System.out.println(numberIdenticalWordsMap);

        for(ContainerForWord containerForWord : collectionSet){
            System.out.println("Word: '" + containerForWord.getName() + "' NumberRepetitions: " + containerForWord.getnumberOfRepetitions());
        }
    }

    static void numberVowelsInWord(ContainerForWord s){
        int vowelCounter = 0;

        Set<String> collectionVowels = new HashSet<String>(Arrays.asList("A", "a", "E", "e", "I", "i", "O", "o", "U", "u", "Y", "y"));
        char[] stringCollection = s.getName().toCharArray();
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