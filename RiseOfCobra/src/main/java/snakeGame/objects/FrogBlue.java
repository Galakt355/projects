package snakeGame.objects;
import snakeGame.SnakeGame;

public class FrogBlue extends Frog implements Runnable{

    public FrogBlue(int startX, int startY, int id) {
        super(startX, startY, id);
    }

    @Override
    public int getPointsForFrog() {
        return Snake.snakeDirection = 4;
    }

    public int getPositionByX() {
        return positionByX;
    }

    public int getPositionByY() {
        return positionByY;
    }

    @Override
    public void run() {
        int i = 0;
        while (!killFrog && !SnakeGame.gameOver) {
            try {
                move();
                System.out.println("Голубая лягушка шаг: " + i++);
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
        }
    }
}
