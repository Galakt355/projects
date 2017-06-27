import java.util.*;

public class ContainerAggregateObject29{
    static Queue<Command> commandQueue = new PriorityQueue<Command>();

    public static void main(String[] args)
    {
        new ContainerAggregateObject29().aggregate();
    }

    void aggregate(){
        for(int i = 0; i < 10; i++){
            commandQueue.offer(new Command());
        }
        System.out.println(commandQueue);
    }
}

class Command extends Object{

}