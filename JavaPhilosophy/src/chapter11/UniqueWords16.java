import java.util.*;

public class UniqueWords16{
    static int wordCount;
    static int vowelCountAll;

    public static void main(String[] args)
    {
        String str = "The people always dreamed about space travelling and flying to different stars.";
        System.out.println(str);

        Set<String> collectionSet = new HashSet<String>();
        Collections.addAll(collectionSet, str.split(" "));
        System.out.println(collectionSet);

        Iterator<String> iteratorSet = collectionSet.iterator();
        while(iteratorSet.hasNext()){
            numberVowelsInWord(iteratorSet.next());
        }
		
		System.out.println("Vowel counter all: " + vowelCountAll);
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
            }
        }

        System.out.println("World number " + ++wordCount + " vowel counter: " + vowelCounter);        
    }
}