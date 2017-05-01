public class Task15 {
    Str s;
    {
        s = new Str();
        System.out.println("Initial");
    }

    public static void main(String[] args) {
        System.out.println("Old loading");
        new Task();
        System.out.println("New loading");
    }

}

class Str{
    Str(){
        System.out.println("Initial");
    }

}