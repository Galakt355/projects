package snakeGame.objects;
import snakeGame.SnakeGame;

public class Snake {

    public static final int RIGHT = 0;
    public static final int DOWN = 1;
    public static final int LEFT = 2;
    public static final int UP = 3;
    public static final int STOP = 4;

    public static int snakeDirection = 0;
    public static int length = 0;
    public static int lengthOld;

    public static volatile int snakeX[] = new int[SnakeGame.WIDTH*SnakeGame.HEIGHT];
    public static volatile int snakeY[] = new int[SnakeGame.WIDTH*SnakeGame.HEIGHT];

    public Snake(int x0, int y0) {
        snakeX[0] = x0;
        snakeY[0] = y0;
    }

    public void move() {
        for (int d = length; d > 0; d--) {
            snakeX[d] = snakeX[d - 1];
            snakeY[d] = snakeY[d - 1];
        }
        if (snakeDirection == RIGHT) {
            snakeX[0]++;
        } else if (snakeDirection == DOWN) {
            snakeY[0]++;
        }
        else if (snakeDirection == LEFT) {
            snakeX[0]--;
        }
        else if (snakeDirection == UP) {
            snakeY[0]--;
        }
        else if (snakeDirection == STOP) {
            snakeDirection = STOP;
        }
        for (int d = length - 1; d > 0; d--) {
            if ((snakeX[0] == snakeX[d]) && (snakeY[0] == snakeY[d])) {
                snakeDirection = STOP;
            }
        }
        if (snakeX[0] > SnakeGame.WIDTH - 1){
            snakeX[0] = 0;
        } else if(snakeX[0] < 0){
            snakeX[0] = SnakeGame.WIDTH - 1;
        }
        if (snakeY[0] > SnakeGame.HEIGHT - 1){
            snakeY[0] = 0;
        } else if(snakeY[0] < 0){
            snakeY[0] = SnakeGame.HEIGHT - 1;
        }
    }

    public int getLengthOld() {
        return lengthOld;
    }
}
