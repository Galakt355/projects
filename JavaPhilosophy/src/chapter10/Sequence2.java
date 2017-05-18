interface Selector
{
    boolean end();

    Object current();

    void next();
}

public class Sequence2
{
    private Object[] items;
    private int next = 0;

    public Sequence2(int size)
    {
        items = new Object[size];
    }

    public static void main(String[] args)
    {
        Sequence2 sequence2 = new Sequence2(7);
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
        if (next < items.length)
        {
            items[next++] = x;
        }
    }

    public class SequenceSelector implements Selector
    {
        private int i = 0;

        public boolean end()
        {
            return i == items.length;
        }

        public Object current()
        {
            return items[i];
        }

        public void next()
        {
            if (i < items.length) i++;
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