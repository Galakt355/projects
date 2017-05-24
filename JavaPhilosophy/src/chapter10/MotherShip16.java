interface Iship{
    int move();
}

public class MotherShip16{

    public static void main(String[] args){
        Iship ship = getSpaceFighter();
        ship.move();
    }

    private static class SpaceFighter implements Iship{
        private int speed = 100000;
        public int move(){
            System.out.println("SpaceFighter speed: " + speed + " km\\s");
            return speed;
        }
    }

    public static Iship getSpaceFighter(){
        return new SpaceFighter();
    }
}