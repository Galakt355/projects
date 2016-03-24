package snakeGame.objects;
import snakeGame.SnakeGame;

public class FrogGreen extends Frog implements Runnable{

    public FrogGreen(int startX, int startY, int id) {
        super(startX, startY, id);
    }

    @Override
    public int getPointsForFrog() {
        return GREENCONST;
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
                System.out.println("Зелёная лягушка шаг: " + i++);
                Thread.sleep(1500);
            } catch (InterruptedException e) {
            }
        }
    }
}
