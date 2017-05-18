public class Outer3{
    private static String s;

    Outer3(){
        s = "'Inner' it should be static to use from 'main' !";
    }

    static class Inner extends Outer3{

        @Override
        public String toString()
        {
            return Outer3.s;
        }
    }

    public static void main(String[] args){
        Inner inner = new Inner();
        System.out.println(inner);
    }

}