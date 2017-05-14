import newInterface.Ianimals5;
public class Animals5 implements Ianimals5
{  

    public static void main(String[] args){
        Animals5 ani = new Animals5();		
        ani.run();		
        ani.eat();		
        ani.game();		
    }
	
	public void run(){
        System.out.println("Animals5.run()");
    }
    public void eat(){
        System.out.println("Animals5.eat()");
    }
	public void game(){
        System.out.println("Animals5.game()");
    }

}