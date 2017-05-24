interface Iship{
    void move();
}

interface Icapsule{
    void capsuleOperatingTime();
}

public class MotherShip17{

    public static void main(String[] args){
        Iship ship = getSpaceFighter();
        ship.move();
        Icapsule capsule = getLifeSavingCapsule();
        capsule.capsuleOperatingTime();
    }

    private static class SpaceFighter implements Iship{
        private int speed = 100000;
        public void move(){
            System.out.println("SpaceFighter speed: " + speed);
        }

        private static class LifeSavingCapsule implements Icapsule{
            private int time = 100000;
            public void capsuleOperatingTime(){
                System.out.println("Capsule operating time: " + time + " minute");
            }
        }
    }

    public static Iship getSpaceFighter(){
        return new SpaceFighter();
    }

    public static SpaceFighter.LifeSavingCapsule getLifeSavingCapsule(){
        return new SpaceFighter.LifeSavingCapsule();
    }
}