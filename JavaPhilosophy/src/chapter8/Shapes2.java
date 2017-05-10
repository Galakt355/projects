import java.util.*;

public class Shapes2
{
    private static RandomShapeGen gen = new RandomShapeGen();

    public static void main(String[] args){
        Shape[] s = new Shape[9];

        for(int i = 0; i<s.length; i++) s[i] = gen.next();
        //Polymorphic method calls
        for(Shape shp : s) shp.draw();
        for(Shape shp : s) shp.erase();
    }

}

class Shape{
    public void draw(){}
    public void erase(){}
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

class RandomShapeGen{
    private Random rand = new Random(50);

    public Shape next(){
        switch(rand.nextInt(3)){
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }
}