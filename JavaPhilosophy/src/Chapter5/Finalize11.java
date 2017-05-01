
public class Finalize11 {
    public static void main(String[] args) throws InterruptedException {
        while(true) {
            new BigObject();
            new LongFinalize();            
        }
    }

    static class LongFinalize {
        protected void finalize() throws Throwable {
            System.out.println("Method finalize worked for the object LongFinalize !");
            Thread.sleep(1000);
        }
    }

    static class BigObject {
        char[] tmp = new char[10000];
        protected void finalize() throws Throwable {
            System.out.println("Method finalize worked for the object BigObject !");
        }
    }
}