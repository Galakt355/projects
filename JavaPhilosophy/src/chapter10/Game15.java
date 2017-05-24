import java.util.Random;

interface Game{
    void move();
}

interface GameFactory{
    Game getGame();
}

public class Game15{
    static Random rand = new Random();

    public static void main(String[] args){
        Game15 game15 = new Game15();
        goGame(game15.getDiceFactory());
        goGame(game15.getCoinFactory());
    }

    public static void goGame(GameFactory factory){
        Game game = factory.getGame();
        game.move();
    }

    public GameFactory getDiceFactory()
    {
        return new GameFactory(){
            public Game getGame(){
                return new Dice();
            }
        };
    }

    public GameFactory getCoinFactory()
    {
        return new GameFactory(){
            public Game getGame(){
                return new Coin();
            }
        };
    }
}

class Dice implements Game{

    public void move(){
        for (int i=0;i<10;i++){
            int dice1 = Game15.rand.nextInt(6);
            int dice2 = Game15.rand.nextInt(6);
            System.out.println("dice1: " + ++dice1 + " dice2: " + ++dice2);
        }
    }
}

class Coin implements Game{
    public void move(){
        for (int i=0;i<10;i++){
            if (Game15.rand.nextBoolean()){
                System.out.println("Eagle !!!");
            }
            else {
                System.out.println("Cutting !");
            }
        }
    }
}