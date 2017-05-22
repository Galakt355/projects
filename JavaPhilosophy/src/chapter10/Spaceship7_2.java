import spaceInterface.*;
public class Spaceship7_2{

    public static void main(String[] args){
        Spaceship7_2 spaceship = new Spaceship7_2();
        Inavigate navigate = spaceship.navigateInSpace("Spaceship 'Colossus' ready to fly !");
        System.out.println(navigate.readLabel());
    }
	
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

    public Inavigate navigateInSpace(String s){        
        return new Dreadnought(s);
    }
}