interface Selector
{
    boolean end();

    Object current();

    void next();
}

public class Sequence4
{
    private Object[] items;
    private int next = 0;

    public Sequence4(int size)
    {
        items = new Object[size];
    }

    public static void main(String[] args)
    {
        Sequence4 Sequence4 = new Sequence4(7);
        for (int i = 0; i < 10; i++)
        {
            Sequence4.add(new Inner());
        }
        Selector selector = Sequence4.selector();
        while (!selector.end())
        {
            System.out.println(selector.current());
            selector.next();
        }

        Sequence4.SequenceSelector sequenceSelector = Sequence4.new SequenceSelector();
        Sequence4 ref = sequenceSelector.getReference();
        System.out.println("Call the reference to the base class 'Sequence4' from the inner class 'SequenceSelector': " + ref);
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
        public Sequence4 getReference(){
            return Sequence4.this;
        }

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