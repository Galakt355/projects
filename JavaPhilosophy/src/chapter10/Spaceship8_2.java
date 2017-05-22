import spaceInterface.*;
public class Spaceship8_2{

    public static void main(String[] args){
        Spaceship8_2 spaceship = new Spaceship8_2();
        Inavigate navigate = spaceship.navigateInSpace("Spaceship 'Colossus' ready to fly !");
        System.out.println(navigate.readLabel());
    }

    public Inavigate navigateInSpace(String s){
        class Dreadnought implements Inavigate{
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
        return new Dreadnought(s);
    }
}