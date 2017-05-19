public class Spaceship7{
    private int speed = 7000;

    public static void main(String[] args){
        Spaceship7 spaceship = new Spaceship7();
        spaceship.movesSlow();
    }

    private void movesFast(){
        System.out.println("Spaceship moving in space with speed: " + speed + " m\\s");
    }

    private void movesSlow(){
        System.out.println("BaseSpaceship moving in space with speed: " + speed + " m\\s");
        BaseSpaceship baseSpaceship = new BaseSpaceship();
        baseSpaceship.navigateInSpace();
    }

    class BaseSpaceship{
        public void navigateInSpace()
        {
            speed = 700000;
            movesFast();
        }
    }
}