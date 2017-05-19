import hangar.Spaceship6;
import hangar.newInterface.Ispace;

public class Cruiser6 extends Spaceship6
{
    public static void main(String[] args)
    {
        Spaceship6 spaceship6 = new Spaceship6();
        Ispace baseSpaceship = spaceship6.getBaseSpaceship();
        System.out.println(baseSpaceship);
        baseSpaceship.navigateInSpace();
    }
}