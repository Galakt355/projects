interface Iship{
    void move();
}

interface Icapsule{
    void capsuleOperatingTime();
}

public class MotherShip17_2{

    public static void main(String[] args){
        MotherShip17_2 motherShip = new MotherShip17_2();
        SpaceFighter shipFighter = motherShip.new SpaceFighter();
        shipFighter.move();
        MotherShip17_2.SpaceFighter.LifeSavingCapsule capsule = shipFighter.new LifeSavingCapsule();
        capsule.capsuleOperatingTime();
    }

    class SpaceFighter implements Iship{
        private int speed = 100000;
        public void move(){
            System.out.println("SpaceFighter speed: " + speed);
        }

        class LifeSavingCapsule implements Icapsule{
            private int time = 10000;
            public void capsuleOperatingTime(){
                System.out.println("Capsule operating time: " + time + " minute");
            }
        }
    }
}