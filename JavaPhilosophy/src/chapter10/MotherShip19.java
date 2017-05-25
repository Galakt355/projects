interface Iship{
    void move();

    class SpaceFighter implements Iship{
        public void move(){
            System.out.println("SpaceFighter speed: 100000 km\\s");
        }

        public static void getMove(SpaceFighter spaceFighter){
            System.out.println(spaceFighter.getClass());
            new SpaceFighter().move();
        }

        public static void main(String[] args){
            System.out.println("Main is needed to use the class as a test !");
            new SpaceFighter().move();
        }
    }
}

public class MotherShip19 implements Iship{

    public static void main(String[] args){
        SpaceFighter spaceFighter = new SpaceFighter();
        SpaceFighter.getMove(spaceFighter);
    }

    public void move(){

    }
}