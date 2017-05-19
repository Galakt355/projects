public class Sequence5
{
    public static void main(String[] args){
        Base base = new Base();
		Base.Inner inner = base.new Inner();
		System.out.println(inner);
	}    
}

class Base{
	class Inner
    {
        @Override
        public String toString()
        {
            return "An internal class 'Inner' object from a third-party class 'Sequence5' is used !";
        }
    }
}