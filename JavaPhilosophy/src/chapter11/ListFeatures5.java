import java.util.*;

public class ListFeatures5{

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> integerList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        System.out.println("1: " + integerList);

        Integer objectInt = new Integer(8);
        integerList.add(objectInt);
        System.out.println("2: " + integerList);
        System.out.println("3: " + integerList.contains(objectInt));

        integerList.remove(objectInt);
        Integer i = integerList.get(2);
        System.out.println("4: Object: " + i + " index: " + integerList.indexOf(i));

        Integer integerObjNew = new Integer(9);
        System.out.println("5: " + integerList.indexOf(integerObjNew));
        System.out.println("6: " + integerList.remove(integerObjNew) + integerList);

        Integer integerObjNew2 = new Integer(6);
        System.out.println("5: " + integerList.indexOf(integerObjNew2));
        System.out.println("6: " + integerList.remove(integerObjNew2) + integerList);

        System.out.println("7: " + integerList.remove(i));
        System.out.println("8: " + integerList);

        integerList.add(2, 6);
        System.out.println("9: " + integerList);

        List<Integer> sub = integerList.subList(1, 4);
        System.out.println("Partial list: " + sub);
        System.out.println("10: " + integerList.containsAll(sub));

        Collections.sort(sub);
        System.out.println("10_2 After sorting: " + sub);

        System.out.println("11: Sequence is not important " + integerList.containsAll(sub));

        Collections.shuffle(sub, random);
        System.out.println("11_2: After mixing " + sub);

        System.out.println("12: " + integerList.containsAll(sub));

        List<Integer> copy = new ArrayList<Integer>(integerList);
        sub = Arrays.asList(integerList.get(1), integerList.get(4));
        System.out.println("integerList: " + integerList);
        System.out.println("sub: " + sub);
        System.out.println("copy: " + copy);
        copy.retainAll(sub);
        System.out.println("13: : " + copy);

        System.out.println("integerList: " + integerList);
        copy = new ArrayList<Integer>(integerList);
        copy.remove(2);
        System.out.println("14: " + copy);

        System.out.println("copy: : " + copy);
        System.out.println("sub: : " + sub);
        copy.retainAll(sub);
        System.out.println("15: : " + copy);
        copy.set(1, 13);
        System.out.println("16: : " + copy);
        copy.addAll(2, sub);
        System.out.println("17: : " + copy);
        System.out.println("18: : " + integerList.isEmpty());
        integerList.clear();
        System.out.println("19: : " + integerList);
        System.out.println("20: : " + integerList.isEmpty());
        integerList.addAll(Arrays.asList(1, 2, 3, 4));
        System.out.println("21: : " + integerList);
        Object[] o = integerList.toArray();
        System.out.println("22: : " + o[3]);
        Integer[] pa = integerList.toArray(new Integer[0]);
        System.out.println("23: : " + pa[3]);
    }
}