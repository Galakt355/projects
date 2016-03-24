package snakeGame;
import snakeGame.objects.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class SnakeGame extends JPanel{

    public static final int SCALE = 25;
    public static final int WIDTH = 25;
    public static final int HEIGHT = 25;

    public static int SLEEP = 0;
    public static int numberRedFrog = 0;
    public static int numberRedGreen  = 0;
    public static int numberRedBlue  = 0;
    public static int idFrog = 0;
    private static boolean buttonVisible = true;
    public static volatile boolean gameOver;
    private static int points = 0;
    private String message;

    public volatile static ArrayList<Frog> listThreadFrog = new ArrayList<>();
    public static ArrayList<Frog> listForCheckCoordinatesFrogs = new ArrayList<>();
    public static ArrayList<Frog> listDeadFrog = new ArrayList<>();
    public static ArrayList<Frog> listNewFrog = new ArrayList<>();
    public static Snake snake;

    public static void main(String[] args) {
        new Reader().scan();
        startInterface();
    }

    public SnakeGame() throws HeadlessException {
        snake = new Snake(10, 10);
        ruling();
        setFocusable(true);

        Thread snakeThread = new Thread(new Runnable() {
            public void run() {
                int i = 0;
                while (!gameOver) {
                    try {
                        gameCycle();
                        System.out.println("Бросок кобры: " + i++);
                        Thread.sleep(SLEEP);
                    } catch (InterruptedException e) {
                    }
                }
            }
        });
        snakeThread.setDaemon(true);
        snakeThread.start();

        generateThreadsFrogsRed();
        generateThreadsFrogsGreen();
        generateThreadsFrogsBlue();
    }

    public void gameCycle() {
        snake.move();
        if (Snake.snakeDirection == Snake.STOP){
            message = "GAME OVER !";
            gameOver = true;
            startInterface();
        }
        repaint();
    }

    private void ruling(){
        addMouseListener(new MouseListener() {
            @Override
            public void mousePressed(MouseEvent e) {
                if ((e.getButton() == MouseEvent.BUTTON3) && Snake.snakeDirection == 0 && !gameOver){
                    Snake.snakeDirection = 1;
                }
                else if ((e.getButton() == MouseEvent.BUTTON3) && Snake.snakeDirection == 1 && !gameOver){
                    Snake.snakeDirection = 2;
                }
                else if ((e.getButton() == MouseEvent.BUTTON3) && Snake.snakeDirection == 2 && !gameOver){
                    Snake.snakeDirection = 3;
                }
                else if ((e.getButton() == MouseEvent.BUTTON3) && Snake.snakeDirection == 3 && !gameOver){
                    Snake.snakeDirection = 0;
                }
                else if ((e.getButton() == MouseEvent.BUTTON1) && Snake.snakeDirection == 0 && !gameOver){
                    Snake.snakeDirection = 3;
                }
                else if ((e.getButton() == MouseEvent.BUTTON1) && Snake.snakeDirection == 3 && !gameOver){
                    Snake.snakeDirection = 2;
                }
                else if ((e.getButton() == MouseEvent.BUTTON1) && Snake.snakeDirection == 2 && !gameOver){
                    Snake.snakeDirection = 1;
                }
                else if ((e.getButton() == MouseEvent.BUTTON1) && Snake.snakeDirection == 1 && !gameOver){
                    Snake.snakeDirection = 0;
                }
            }
            @Override
            public void mouseClicked(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
        });
    }

    private FrogRed generateFrogRed(){
        return new FrogRed((int)(Math.random()*WIDTH), (int)(Math.random()*HEIGHT), idFrog++);
    }
    private FrogGreen generateFrogGreen(){
        return new FrogGreen((int)(Math.random()*WIDTH), (int)(Math.random()*HEIGHT), idFrog++);
    }
    private FrogBlue generateFrogBlue(){
        return new FrogBlue((int)(Math.random()*WIDTH), (int)(Math.random()*HEIGHT), idFrog++);
    }

    private void generateThreadsFrogsRed(){
        Thread t[] = new Thread[numberRedFrog];
        for (int i=0; i < t.length; i++) {
            FrogRed frogRed = generateFrogRed();
            listThreadFrog.add(frogRed);
            t[i]=new Thread(frogRed);
            t[i].setDaemon(true);
            t[i].start();
        }
    }
    private void generateThreadsFrogsGreen(){
        Thread t[] = new Thread[numberRedGreen];
        for (int i=0; i < t.length; i++) {
            FrogGreen frogGreen = generateFrogGreen();
            listThreadFrog.add(frogGreen);
            t[i]=new Thread(frogGreen);
            t[i].setDaemon(true);
            t[i].start();
        }
    }
    private void generateThreadsFrogsBlue(){
        Thread t[] = new Thread[numberRedBlue];
        for (int i=0; i < t.length; i++) {
            FrogBlue frogBlue = generateFrogBlue();
            listThreadFrog.add(frogBlue);
            t[i]=new Thread(frogBlue);
            t[i].setDaemon(true);
            t[i].start();
        }
    }
    private Frog generateThreadsFrog(Frog frog){
        Thread t = new Thread((Runnable) frog);
        t.setDaemon(true);
        t.start();
        return frog;
    }

    public static void startInterface() {
        final JFrame startFrame = new JFrame("Меню игры");
        startFrame.setLayout(null);
        startFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        startFrame.setSize(280, 180);
        startFrame.setVisible(true);

        final JButton go = new JButton("Начать игру");
        go.setLocation(30, 20);
        go.setSize(200, 40);
        go.setEnabled(buttonVisible);
        startFrame.add(go);

        final JButton exit = new JButton("Выйти из игры");
        exit.setLocation(30, 80);
        exit.setSize(200, 40);
        exit.setEnabled(!buttonVisible);
        startFrame.add(exit);

        go.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                go.setEnabled(!buttonVisible);
                exit.setEnabled(buttonVisible);
                startGame();
            }
        });

        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });
    }

    public static void startGame() {
        gameOver = false;
        points = 0;
        Snake.snakeDirection = 0;
        listThreadFrog.clear();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(WIDTH * SCALE + 7, WIDTH * HEIGHT + 34);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.add(new SnakeGame());
    }

    public static void getListThreadFrogs(){
        ArrayList<Frog> frogs = new ArrayList<>();
        for (Frog frog: listThreadFrog){
            frogs.add(frog);
        }
        listForCheckCoordinatesFrogs = frogs;
    }

    public void paint(Graphics graphics) {
        graphics.setColor(new Color(0, 75, 50));
        graphics.fillRect(0, 0, WIDTH * SCALE, HEIGHT * SCALE);

        graphics.setColor(new Color(0, 150, 100));
        for (int x = 0; x < WIDTH * SCALE; x += SCALE) {
            graphics.drawLine(x, 0, x, HEIGHT * SCALE);
        }
        for (int y = 0; y < WIDTH * SCALE; y += SCALE) {
            graphics.drawLine(0, y, HEIGHT * SCALE, y);
        }

        drawSnake(graphics);
        listFrogsChange();
        getListThreadFrogs();
        drawFrogs(graphics);

        graphics.setColor(new Color(255, 255, 0));
        graphics.drawString("Points: " + points, 1, 10);

        if (message != null) {
            graphics.setColor(Color.DARK_GRAY);
            graphics.fillRect(270, 270, 100, 30);
            graphics.setColor(Color.RED);
            graphics.drawRect(270, 270, 100, 30);
            graphics.drawString(message, 280, 290);
        }
    }

    private void listFrogsChange(){
        for (Frog frog: listDeadFrog){
            listThreadFrog.remove(frog);
        }
        for (Frog frog: listNewFrog){
            listThreadFrog.add(frog);
        }
        listDeadFrog.clear();
        listNewFrog.clear();
    }

    private void drawSnake(Graphics graphics){
        for (int d = 0; d < Snake.length; d++) {
            graphics.setColor(new Color(255, 150, 100));
            graphics.fillArc(snake.snakeX[d] * SCALE, snake.snakeY[d] * SCALE, SCALE, SCALE, 0, 360);

            if (d == 0){
                for (Frog frog: listThreadFrog){
                    switch (frog.getClass().getSimpleName()) {
                        case "FrogRed":
                            if (compareCoordinates(frog)){
                                frog.randomPos();
                                if (Snake.length > snake.getLengthOld()){
                                    Snake.length--;
                                }
                                points += frog.getPointsForFrog();
                                frog.killFrog = true;
                                Frog frogNew = generateFrogRed();
                                throwDeadFrogAndCreateNew(frogNew, frog);
                                generateThreadsFrog(frogNew);
                            }
                            break;
                        case "FrogGreen":
                            if (compareCoordinates(frog)){
                                frog.randomPos();
                                Snake.length++;
                                points += frog.getPointsForFrog();
                                frog.killFrog = true;
                                Frog frogNew = generateFrogGreen();
                                throwDeadFrogAndCreateNew(frogNew, frog);
                                generateThreadsFrog(frogNew);
                            }
                            break;
                        case "FrogBlue":
                            if (compareCoordinates(frog)){
                                Snake.snakeDirection = Snake.STOP;
                                message = "GAME OVER !";
                                gameOver = true;
                                startInterface();
                            }
                            break;
                    }
                }
            }
        }
    }

    private void drawFrogs(Graphics graphics){
        for (Frog frog: listThreadFrog){
            switch (frog.getClass().getSimpleName()) {
                case "FrogRed":
                    graphics.setColor(new Color(255, 0, 0));
                    graphics.fillArc(frog.getPositionByX() * SCALE, frog.getPositionByY() * SCALE, SCALE, SCALE, 0, 360);
                    break;
                case "FrogGreen":
                    graphics.setColor(new Color(0, 255, 0));
                    graphics.fillArc(frog.getPositionByX() * SCALE, frog.getPositionByY() * SCALE, SCALE, SCALE, 0, 360);
                    break;
                case "FrogBlue":
                    graphics.setColor(new Color(0, 0, 255));
                    graphics.fillArc(frog.getPositionByX() * SCALE, frog.getPositionByY() * SCALE, SCALE, SCALE, 0, 360);
                    break;
            }
        }
    }

    private void throwDeadFrogAndCreateNew(Frog nFrog, Frog dFrog){
        if (nFrog == null || dFrog == null)return;
        listDeadFrog.add(dFrog);

        if (nFrog.getClass().getSimpleName().equals("FrogRed")) {
            listNewFrog.add(nFrog);

        } else if (nFrog.getClass().getSimpleName().equals("FrogGreen")) {
            listNewFrog.add(nFrog);
        }
    }

    private boolean compareCoordinates(Frog frog){
        if ((snake.snakeX[0] == frog.getPositionByX()) && (snake.snakeY[0] == frog.getPositionByY())){
            return true;
        }
        return false;
    }
}
