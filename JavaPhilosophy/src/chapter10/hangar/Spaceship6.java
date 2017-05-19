package hangar;
import hangar.newInterface.*;

public class Spaceship6
{
    public static void main(String[] args){

    }

    private class BaseSpaceship implements Ispace{
        @Override
        public String toString()
        {
            return "Space ship base awaits landing of the cruiser !";
        }

        public void navigateInSpace()
        {
            System.out.println("Moves in space !");
        }
    }

    public Ispace getBaseSpaceship(){
        return new BaseSpaceship();
    }
}