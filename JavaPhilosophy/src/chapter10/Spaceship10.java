import spaceInterface.*;
public class Spaceship10{

    public static void main(String[] args){
        Spaceship10 spaceship = new Spaceship10();
        Inavigate navigate = spaceship.navigateInSpace("Spaceship 'Colossus' ready to fly ! ");
        System.out.println(navigate);
        System.out.println(navigate.readLabel());
    }

    public Inavigate navigateInSpace(final String str){
        return new Inavigate(){
            @Override
            public String toString()
            {
                return str + getClass();
            }

            @Override
            public String readLabel()
            {
                return str + "get 'readLabel()' !";
            }

        };
    }
}