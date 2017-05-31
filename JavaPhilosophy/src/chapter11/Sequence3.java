import java.util.*;

interface Selector
{
    boolean end();

    Object current();

    void next();
}

public class Sequence3
{
    private ArrayList<Inner> items;
    private int next = 0;

    public Sequence3()
    {
        items = new ArrayList<Inner>();
    }

    public static void main(String[] args)
    {
        Sequence3 sequence2 = new Sequence3();
        for (int i = 0; i < 10; i++)
        {
            sequence2.add(new Inner());
        }
        Selector selector = sequence2.selector();
        while (!selector.end())
        {
            System.out.println(selector.current());
            selector.next();
        }
    }

    public void add(Object x)
    {
        if (next < 7)
        {
            items.add((Inner) x);
        }
    }

    public class SequenceSelector implements Selector
    {
        private int i = 0;

        public boolean end()
        {
            return i == 7;
        }

        public Object current()
        {
            return items.get(i);
        }

        public void next()
        {
            if (i < 7) i++;
        }
    }

    public Selector selector()
    {
        return new SequenceSelector();
    }

    static class Inner
    {

        @Override
        public String toString()
        {
            return "'Inner' it should be static to use from 'main' !";
        }
    }
}