
public class FinalizeTank12 {
    public static void main(String[] args) throws InterruptedException {
        Tank tank = new Tank(true);

        tank.checkIn();
        new Tank(true);
        System.gc();
    }    
}

class Tank {

    boolean full;

    Tank(boolean _full){
        full = _full;
    }

    void checkIn(){
        full = false;
    }

    public void finalize() throws Throwable {
        if (full){
            System.out.println("Tank is full !");
        }
        System.out.println("Tank is empty.");
        System.out.println("Tank was removed !");
    }
}
