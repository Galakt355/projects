import java.util.*;

public class IterableRandomShapeGenerator31{
    public static void main(String[] args)
    {
        for(Shape shape : new RandomShapeGenerator(7)){
            System.out.println(shape.getClass().getSimpleName());
        }
    }
}

class RandomShapeGenerator implements Iterable<Shape>{
    private Random rand = new Random();
    private int numberShaps;

    RandomShapeGenerator(int numberShaps){
        this.numberShaps = numberShaps;
    }

    private Shape nextShape(){
        switch(rand.nextInt(3)){
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }

    @Override
    public Iterator<Shape> iterator()
    {
        return new Iterator<Shape>()
        {
            private int index = 0;

            @Override
            public boolean hasNext()
            {
                return index < numberShaps;
            }

            @Override
            public Shape next()
            {
                ++index;
                return nextShape();
            }

            @Override
            public void remove()
            {
                throw new UnsupportedOperationException();
            }
        };
    }
}

abstract class Shape{
    public abstract void draw();
    public abstract void erase();
}

class Circle extends Shape{
    @Override
    public void draw(){
        System.out.println("Circle.draw()");
    }
    @Override
    public void erase(){
        System.out.println("Circle.erase()");
    }
}

class Square extends Shape{
    @Override
    public void draw(){
        System.out.println("Square.draw()");
    }
    @Override
    public void erase(){
        System.out.println("Square.erase()");
    }
}

class Triangle extends Shape{
    @Override
    public void draw(){
        System.out.println("Triangle.draw()");
    }
    @Override
    public void erase(){
        System.out.println("Triangle.erase()");
    }
}