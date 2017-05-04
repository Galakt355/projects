

class Inheritance2_2 extends Inheritance2{
	
	@Override
    public void scrub(){
        super.scrub();
        System.out.println("Foreign Class scrub()");
        sterilize();
    }

    void sterilize(){
        System.out.println("Foreign Class sterilize()");
    }
	
}