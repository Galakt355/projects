package snakeGame;
import snakeGame.objects.Snake;
import java.util.Scanner;

public class Reader implements ISnakeGame{

    public  void scan(){
        try {
            while (getLengthSnake() <= 2 || getLengthSnake() > 10){
                System.out.println("Выберите начальную длину змеи в диапазоне от 3 до 10");
                Scanner scanner = new Scanner(System.in);
                setLengthSnake(scanner.nextInt());
                if (getLengthSnake() <= 2 || getLengthSnake() > 10){
                    System.out.println("Задана некорректная длина !");
                }
            }
            while (getTimeSnakeSLEEP() < 300 || getTimeSnakeSLEEP() > 500){
                System.out.println("Выберите начальную скорость змеи в диапазоне от 300 до 500. Где значение 300 - самая высокая скорость.");
                Scanner scanner = new Scanner(System.in);
                setTimeSnakeSLEEP(scanner.nextInt());
                if (getTimeSnakeSLEEP() < 300 || getTimeSnakeSLEEP() > 500){
                    System.out.println("Задана некорректная скорость !");
                }
            }
            while (getNumberRedFrog() < 1 || getNumberRedFrog() > 3){
                System.out.println("Выберите количество красных лягушек от 1 до 3.");
                Scanner scanner = new Scanner(System.in);
                setNumberRedFrog(scanner.nextInt());
                if (getNumberRedFrog() < 1 || getNumberRedFrog() > 3){
                    System.out.println("Неверное количество красных лягушек !");
                }
            }
            while (getNumberGreenFrog() < 1 || getNumberGreenFrog() > 3){
                System.out.println("Выберите количество зеленых лягушек от 1 до 3.");
                Scanner scanner = new Scanner(System.in);
                setNumberGreenFrog(scanner.nextInt());
                if (getNumberGreenFrog() < 1 || getNumberGreenFrog() > 3){
                    System.out.println("Неверное количество зеленых лягушек !");
                }
            }
            while (getNumberBlueFrog() < 1 || getNumberBlueFrog() > 3){
                System.out.println("Выберите количество синих лягушек от 1 до 3.");
                Scanner scanner = new Scanner(System.in);
                setNumberBlueFrog(scanner.nextInt());
                if (getNumberBlueFrog() < 1 || getNumberBlueFrog() > 3){
                    System.out.println("Неверное количество синих лягушек !");
                } else {
                    System.out.println(" Можно начинать игру !");
                }
            }
            Snake.lengthOld = Snake.length;
        }
        catch (Exception e){
            scan();
        }
    }

    public int getNumberRedFrog() {
        return SnakeGame.numberRedFrog;
    }
    public void setNumberRedFrog(int numberRedFrog) {
        SnakeGame.numberRedFrog = numberRedFrog;
    }
    public int getNumberGreenFrog() {
        return SnakeGame.numberRedGreen;
    }
    public void setNumberGreenFrog(int numberGreenFrog) {
        SnakeGame.numberRedGreen = numberGreenFrog;
    }
    public int getNumberBlueFrog() {
        return SnakeGame.numberRedBlue;
    }
    public void setNumberBlueFrog(int numberBlueFrog) {
        SnakeGame.numberRedBlue = numberBlueFrog;
    }
    public int getTimeSnakeSLEEP() {
        return SnakeGame.SLEEP;
    }
    public void setTimeSnakeSLEEP(int snakeSLEEP) {
        SnakeGame.SLEEP = snakeSLEEP;
    }
    public int getLengthSnake() {
        return Snake.length;
    }
    public void setLengthSnake(int lengthSnake) {
        Snake.length = lengthSnake;
    }
}
