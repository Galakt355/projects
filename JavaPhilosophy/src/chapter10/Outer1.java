public class Outer1{

    static class Inner{
        Inner(){
            System.out.println(" 'Inner' it should be 'static' to use from 'main' !");
        }
    }

    public static void main(String[] args){
        Inner inner = new Inner();
    }

}