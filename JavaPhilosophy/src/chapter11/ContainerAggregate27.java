import java.util.*;

public class ContainerAggregate27{
    static Queue<Command> commandQueue = new PriorityQueue<Command>();

    public static void main(String[] args)
    {
        new ContainerAggregate27().aggregate();        
        new SortingQueue().sortQ(commandQueue);
    }

    void aggregate(){
        for(int i = 0; i < 10; i++){
            commandQueue.offer(new Command("Number " + i));
        }
        System.out.println(commandQueue);
    }
}

class Command implements Comparable<Command> {

    String str;

    Command(String _str){
        str = _str;
    }

    void operation(){
        System.out.println(str);
    }

    public String toString(){
        return str;
    }

    @Override
    public int compareTo(Command o)
    {
        return this.str.compareTo(o.str);
    }
}

class SortingQueue{

    void sortQ(Queue<Command> commandQueue){
        while (commandQueue.peek() != null){
            commandQueue.remove().operation();
        }
    }
}