import java.util.*;

class Pet{
    String name;
    public Pet(String petName){
        name = petName;
    }

    public String toString(){
        return "I'm your pet ! " + name;
    }
}

public class PetsList7{

    public static void main(String[] args) {
        Pet[] pets = new Pet[]{
                new Pet("Tatoshka"),
                new Pet("Bim"),
                new Pet("Rex"),
        };
        List<Pet> petList = new ArrayList<Pet>(Arrays.asList(pets));
        System.out.println(petList);
        List<Pet> subListPets = subList(petList);
        System.out.println(subListPets);
        petList.removeAll(subListPets);
        System.out.println(petList.get(0));
    }

    static List<Pet> subList(List<Pet> list){
        return list.subList(1, 3);
    }
}