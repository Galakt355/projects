import java.util.*;

public class Shapes3
{
    private static RandomShapeGen gen = new RandomShapeGen();

    public static void main(String[] args){
        Shapes3 shapes = new Shapes3();
        shapes.output();

        Shape[] s = new Shape[9];
        for(int i = 0; i<s.length; i++) s[i] = gen.next();
        //Polymorphic method calls
        for(Shape shp : s) shp.draw();
        for(Shape shp : s) shp.erase();
        for(Shape shp : s) shp.output();
    }

    void output(){
        System.out.println("Shapes3.output() !");
    }

}

class Shape{
    public void draw(){}
    public void erase(){}
    public void output(){
        System.out.println("Shape.output() !");
    }
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
    @Override
    public void output(){
        System.out.println("Circle.output()");
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
    @Override
    public void output(){
        System.out.println("Square.output()");
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
    @Override
    public void output(){
        System.out.println("Triangle.output()");
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