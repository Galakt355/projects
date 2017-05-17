import java.util.Random;

interface Game{
	void move();
}

interface GameFactory{
	Game getGame();
}

public class Game19
{
	static Random rand = new Random();
	
    public static void main(String[] args){
        goGame(new DiceFactory());
        goGame(new CoinFactory());        
    }
	
	public static void goGame(GameFactory factory){
		Game game = factory.getGame();
		game.move();
	}
}

class DiceFactory implements GameFactory{
	public Game getGame(){
		return new Dice();
	}
}

class Dice implements Game{

    public void move(){
        for (int i=0;i<10;i++){
            int dice1 = Game19.rand.nextInt(6);
            int dice2 = Game19.rand.nextInt(6);
            System.out.println("dice1: " + ++dice1 + " dice2: " + ++dice2);
        }
    }
}

class CoinFactory implements GameFactory{
	public Game getGame(){
		return new Coin();
	}
}

class Coin implements Game{
    public void move(){
        for (int i=0;i<10;i++){
            if (Game19.rand.nextBoolean()){
                System.out.println("Eagle !!!");
            }
            else {
                System.out.println("Cutting !");
            }
        }
    }
}