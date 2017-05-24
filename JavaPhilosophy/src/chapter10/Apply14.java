interface Processor{
    void turn(String s);
}

public class Apply14
{
    public static void main(String[] args)
    {
        Apply14 apply = new Apply14();
        Processor processor = apply.process();
        processor.turn("ABCDEFG");

        Roll roll = new Roll();
        roll.turn("Do not interchange !");
    }

    public Processor process(){
        return new Processor(){

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

        };
    }
}

class Roll implements Processor{

    public void turn(String s){
        System.out.println(s);
    }
}