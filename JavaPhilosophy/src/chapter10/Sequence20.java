interface Selector
{
    boolean end();

    Object current();

    void next();
}

public class Sequence20
{
    static int n = 1;
    private Object[] items;
    private int next = 0;

    public Sequence20(int size)
    {
        items = new Object[size];
    }

    public static void main(String[] args){
        Sequence20 sequenceElement = new Sequence20(7);
        for (int i = 0; i < 7; i++)
        {
            String str = "'Inner' it should be static to use from 'main' !" + " Object number " + n++;
            sequenceElement.add(new Inner(str));

        }
        Selector selector = sequenceElement.selector();
        while (!selector.end())
        {
            System.out.println(selector.current());
            selector.next();
        }

        Selector selector2 = sequenceElement.reversSelector();
        while (!selector2.end())
        {
            System.out.println(selector2.current());
            selector2.next();
        }

        Sequence20.SequenceSelector sequenceSelector = sequenceElement.new SequenceSelector();
        Sequence20 ref = sequenceSelector.getReference();
        System.out.println("Call the reference to the base class 'Sequence20' from the inner class 'SequenceSelector': " + ref);
    }

    public void add(Object x){
        if (next < items.length)
        {
            items[next++] = x;
        }
    }

    public class SequenceSelector implements Selector{
        public Sequence20 getReference(){
            return Sequence20.this;
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

    public class SequenceSelectorReverse implements Selector{

        private int i = items.length-1;

        public boolean end(){
            return i == -1;
        }

        public Object current()
        {
            return items[i];
        }

        public void next()
        {
            if (i > -1) i--;
        }
    }

    public Selector selector(){
        return new SequenceSelector();
    }

    public Selector reversSelector(){
        return new SequenceSelectorReverse();
    }

    static class Inner{
        String s;

        Inner(String str){
            s = str;
        }

        @Override
        public String toString(){
            return s;
        }
    }
}