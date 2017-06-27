import java.util.*;

public class ContainerAggregateDouble28{
    Random random = new Random();
    static Queue<Double> doubleQueue = new PriorityQueue<Double>();

    public static void main(String[] args)
    {
        new ContainerAggregateDouble28().aggregate();

        while (doubleQueue.peek() != null){
            System.out.println(doubleQueue.poll());
        }

    }

    void aggregate(){
        for(int i = 0; i < 10; i++){
            doubleQueue.offer(random.nextDouble());
        }
        System.out.println(doubleQueue);
    }
}