import spaceInterface.*;
public class Spaceship9{

    public static void main(String[] args){
        Spaceship9 spaceship = new Spaceship9();
        Inavigate navigate = spaceship.navigateInSpace("Spaceship 'Colossus' ready to fly !");
        System.out.println(navigate.readLabel());

        Dreadnought[] m = new Dreadnought[]{
                (Dreadnought) spaceship.navigateInSpace("Spaceship 'Paladin' ready to fly !")
        };
        System.out.println(m[0].readLabel());
    }

    private class Dreadnought implements Inavigate{
        private String label;
        private Dreadnought(String str){
            label = str;
        }

        @Override
        public String readLabel()
        {
            return label;
        }
    }

    public Inavigate navigateInSpace(String s){
        return new Dreadnought(s);
    }
}