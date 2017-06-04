import java.util.*;

public class ListFeatures6{

    public static void main(String[] args) {
        Random random = new Random();
        List<String> StringList = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "F", "G"));
        System.out.println("1: " + StringList);

        String objectInt = new String("H");
        StringList.add(objectInt);
        System.out.println("2: " + StringList);
        System.out.println("3: " + StringList.contains(objectInt));

        StringList.remove(objectInt);
        String i = StringList.get(2);
        System.out.println("4: Object: " + i + " index: " + StringList.indexOf(i));

        String StringObjNew = new String("J");
        System.out.println("5: " + StringList.indexOf(StringObjNew));
        System.out.println("6: " + StringList.remove(StringObjNew) + StringList);

        String StringObjNew2 = new String("K");
        System.out.println("5: " + StringList.indexOf(StringObjNew2));
        System.out.println("6: " + StringList.remove(StringObjNew2) + StringList);

        System.out.println("7: " + StringList.remove(i));
        System.out.println("8: " + StringList);

        StringList.add("L");
        StringList.add("M");
        System.out.println("9: " + StringList);

        List<String> sub = StringList.subList(1, 4);
        System.out.println("Partial list: " + sub);
        System.out.println("10: " + StringList.containsAll(sub));

        Collections.sort(sub);
        System.out.println("10_2 After sorting: " + sub);

        System.out.println("11: Sequence is not important " + StringList.containsAll(sub));

        Collections.shuffle(sub, random);
        System.out.println("11_2: After mixing " + sub);

        System.out.println("12: " + StringList.containsAll(sub));

        List<String> copy = new ArrayList<String>(StringList);
        sub = Arrays.asList(StringList.get(1), StringList.get(4));
        System.out.println("StringList: " + StringList);
        System.out.println("sub: " + sub);
        System.out.println("copy: " + copy);
        copy.retainAll(sub);
        System.out.println("13: : " + copy);

        System.out.println("StringList: " + StringList);
        copy = new ArrayList<String>(StringList);
        copy.remove(2);
        System.out.println("14: " + copy);

        System.out.println("copy: : " + copy);
        System.out.println("sub: : " + sub);
        copy.retainAll(sub);
        System.out.println("15: : " + copy);
        copy.set(1, "X");
        System.out.println("16: : " + copy);
        copy.addAll(2, sub);
        System.out.println("17: : " + copy);
        System.out.println("18: : " + StringList.isEmpty());
        StringList.clear();
        System.out.println("19: : " + StringList);
        System.out.println("20: : " + StringList.isEmpty());
        StringList.addAll(Arrays.asList("A", "B", "C", "D"));
        System.out.println("21: : " + StringList);
        Object[] o = StringList.toArray();
        System.out.println("22: : " + o[3]);
        String[] pa = StringList.toArray(new String[0]);
        System.out.println("23: : " + pa[3]);
    }
}