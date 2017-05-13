public class Transmogrify18
{
    public static void main(String[] args){
        LevelAlert levelAlert = new LevelAlert();
        levelAlert.performPlay();
        levelAlert.changeLevelAlertToGreen();
        levelAlert.performPlay();
		levelAlert.changeLevelAlertToYellow();
        levelAlert.performPlay();
		levelAlert.changeLevelAlertToRed();
        levelAlert.performPlay();
    }
}

class Starship{
    public void getAlert(){
        System.out.println("Starship alert !");
    }
}

class RedAlert extends Starship{
    public void getAlert(){
        System.out.println("Red alert !");
    }
}

class GreenAlert extends Starship{
    public void getAlert(){
        System.out.println("Green alert !");
    }
}

class YellowAlert extends Starship{
    public void getAlert(){
        System.out.println("Yellow alert !");
    }
}

class LevelAlert{
    private Starship starship = new Starship();

    public void changeLevelAlertToRed(){
        starship = new RedAlert();
    }
	
	public void changeLevelAlertToYellow(){
        starship = new YellowAlert();
    }
	
	public void changeLevelAlertToGreen(){
        starship = new GreenAlert();
    }

    public void performPlay(){
        starship.getAlert();
    }
}