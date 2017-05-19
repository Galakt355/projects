public class Spaceship8{

    public static void main(String[] args){
        Spaceship8 spaceship = new Spaceship8();
//        speed = 700000;
//        navigateInSpace();
        Spaceship8.BaseSpaceship baseSpaceship = spaceship.new BaseSpaceship();
        baseSpaceship.speed = 900000;
        baseSpaceship.navigateInSpace();

        Spaceship8.BaseSpaceship.SubsidiarySpaceship subsidiarySpaceship = baseSpaceship.new SubsidiarySpaceship();
        subsidiarySpaceship.speed = 60000;
        subsidiarySpaceship.navigateInSpace();
    }

    class BaseSpaceship{
        public int speed = 3000;
        public void navigateInSpace(){
            System.out.println("BaseSpaceship moving in space with speed: " + speed + " m\\s");
        }

        class SubsidiarySpaceship{
            private int speed = 3000;
            private void navigateInSpace(){
                System.out.println("SubsidiarySpaceship moving in space with speed: " + speed + " m\\s");
            }
        }
    }
}