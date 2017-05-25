interface Iship{
    void move();

    class SpaceFighter implements Iship{
        public void move(){
            System.out.println("SpaceFighter speed: 100000 km\\s");
        }

        public static void main(String[] args){
            System.out.println("Main is needed to use the class as a test !");
            new SpaceFighter().move();
        }
    }
}

public class MotherShip18 implements Iship{

    public static void main(String[] args){
        new SpaceFighter().move();
    }

    public void move(){

    }
}