package snakeGame.objects;
import snakeGame.SnakeGame;

public abstract class Frog{

    private volatile int posFrogX;
    private volatile int posFrogY;
    private volatile int idFrog;
    protected volatile int positionByX;
    protected volatile int positionByY;
    protected volatile int oldPositionByX;
    protected volatile int oldPositionByY;
    protected volatile boolean coordinatesCoincide;
    public volatile boolean killFrog;
    protected static final int REDCONST = 1;
    protected static final int GREENCONST = 2;

    public Frog(int startX, int startY, int id) {
        posFrogX = startX;
        posFrogY = startY;
        idFrog = id;
    }

    public synchronized void move(){
        oldPositionByX = positionByX;
        oldPositionByY = positionByY;

        selectDirection();

        for (Frog frog: SnakeGame.listForCheckCoordinatesFrogs){
            if (idFrog == frog.getId()) break;

            if ((positionByX == frog.getPositionByX()) && (positionByY == frog.getPositionByY())){
                coordinatesCoincide = true;
            }
            else {
                for (int d = 0; d < Snake.length; d++){
                    if (Snake.snakeX[d] == positionByX && Snake.snakeY[d] == positionByY){
                        coordinatesCoincide = true;
                        break;
                    }
                }
            }
            if (coordinatesCoincide){
                positionByX = oldPositionByX;
                positionByY = oldPositionByY;
                coordinatesCoincide = false;
                break;
            }
        }

        if (positionByX > SnakeGame.WIDTH - 1){
            positionByX = 0;
        } else if(positionByX < 0){
            positionByX = SnakeGame.WIDTH - 1;
        }
        if (positionByY > SnakeGame.HEIGHT - 1){
            positionByY = 0;
        } else if(positionByY < 0){
            positionByY = SnakeGame.HEIGHT - 1;
        }
    }

    private void selectDirection(){
        int randomDirection = (int)(Math.random()*3);

        switch (randomDirection) {
            case 0:
                if (Snake.snakeDirection == Snake.RIGHT){
                    positionByX++;
                }else {
                    positionByX--;
                }
                break;
            case 1:
                if (Snake.snakeDirection == Snake.DOWN){
                    positionByY++;
                }else {
                    positionByY--;
                }
                break;
            case 2:
                if (Snake.snakeDirection == Snake.LEFT){
                    positionByX--;
                }else {
                    positionByX++;
                }
                break;
            case 3:
                if (Snake.snakeDirection == Snake.UP){
                    positionByY--;
                }else {
                    positionByY++;
                }
                break;
        }
    }
    public void randomPos(){
        positionByX = (int)(Math.random()* SnakeGame.WIDTH);
        positionByY = (int)(Math.random()* SnakeGame.HEIGHT);
    }
    public abstract int getPointsForFrog();
    public int getPositionByX() {
        return posFrogX;
    }
    public int getPositionByY() {
        return posFrogY;
    }
    public int getId() {
        return idFrog;
    }
}
