public class PolyConstructors16
{
    public static void main(String[] args){
        new RoundGlyph(5);
        new RectangularGlyph(7);
    }
}

class Glyph{    
	
	Glyph(){
		System.out.println("Before the call Glyph.draw()");
		draw();
		System.out.println("After the call Glyph.draw()");
	}
	
	void draw(){
		System.out.println("Glyph.draw()");
	}
}

class RoundGlyph extends Glyph{
	private int radius = 1;    
	
	RoundGlyph(int r){
		radius = r;
		System.out.println("Generation RoundGlyph.RoundGlyph(), radius = " + radius);
		draw();
		System.out.println("After the call RoundGlyph.draw()");
	}
	
	void draw(){
		System.out.println("RoundGlyph.draw(), radius = " + radius);
	}
}

class RectangularGlyph extends Glyph{
	private int radius = 1;    
	
	RectangularGlyph(int r){
		radius = r;
		System.out.println("Generation RectangularGlyph.RectangularGlyph(), radius = " + radius);
		draw();
		System.out.println("After the call RectangularGlyph.draw()");
	}
	
	void draw(){
		System.out.println("RectangularGlyph.draw(), radius = " + radius);
	}
}