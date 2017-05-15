import newInterface.Processor;

public class Apply11
{
    public static void main(String[] args)
    {
        Roll roll = new Roll();
        roll.turn("ABCDEFG");
    }

    public static void process(Processor p, Object s){
        System.out.println("Using interface Processor " + p.name());
        System.out.println(p.process(s));
    }

}

class Roll{

    public void turn(String str){
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb);
        int length = sb.length();
        for(int i = 0, j = 1; j < length; i = i + 2, j = j + 2){
            char val = str.charAt(i);
            sb.deleteCharAt(i);
            sb.insert(i, str.charAt(i + 1));
            sb.deleteCharAt(i+1);
            sb.insert(i+1, val);
        }
        System.out.println(sb);
    }

}