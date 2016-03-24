package snakeGame.objects;
import snakeGame.SnakeGame;

public class FrogRed extends Frog implements Runnable{

    public FrogRed(int startX, int startY, int id) {
        super(startX, startY, id);
    }

    @Override
    public int getPointsForFrog() {
        return REDCONST;
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
                System.out.println("Красная лягушка шаг: " + i++);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
