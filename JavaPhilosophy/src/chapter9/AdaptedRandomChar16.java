import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

class RandomChar{
    private static Random rand = new Random(50);
    public static char next(){
        return (char)rand.nextInt(65000);
    }
}

public class AdaptedRandomChar16 extends RandomChar implements Readable{

    private static int count;

    public AdaptedRandomChar16(int count){
        this.count = count;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(new AdaptedRandomChar16(7));
        System.out.println(s);
        for(int i=0; i<count; i++){
            System.out.println(RandomChar.next());
        }

    }

    @Override
    public int read(CharBuffer cb) throws IOException{
        if (count-- == 0) return -1;
        String result = String.valueOf(next());
        cb.append(result);
        return result.length();
    }
}