import newInterface.Ianimals5;
public class Animals6 implements Ianimals5
{  

    public static void main(String[] args){
        Animals6 ani = new Animals6();		
        ani.run();		
        ani.eat();		
        ani.game();		
    }
	
	public void run(){
        System.out.println("Method run() public ! Available from another package !");
    }
    public void eat(){
        System.out.println("Method eat() public ! Available from another package !");
    }
	public void game(){
        System.out.println("Method game() public ! Available from another package !");
    }

}