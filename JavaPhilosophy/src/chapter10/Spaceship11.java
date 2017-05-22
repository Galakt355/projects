import spaceInterface.*;
public class Spaceship11{

    public static void main(String[] args){
        Spaceship11 spaceship = new Spaceship11();
        Inavigate navigate = spaceship.navigateInSpace("Spaceship 'Colossus' ready to fly !");
        System.out.println(navigate.readLabel());

        Dreadnought[] m = new Dreadnought[]{
                (Dreadnought) spaceship.navigateInSpace("Spaceship 'Paladin' ready to fly !")
        };
        System.out.println(m[0].readLabel());
    }

    private class Dreadnought implements Inavigate{

        @Override
        public String readLabel()
        {
            return null;
        }
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