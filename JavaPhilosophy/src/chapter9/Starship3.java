public abstract class Starship3
{
    int i;

    Starship3(){
        System.out.println("Call constructor class Starship ! Variable i = " + i);
        print();
    }

    public static void main(String[] args){
        RedAlert redAlert = new RedAlert();
        redAlert.print();
    }

    abstract void print();
}

class RedAlert extends Starship3{

    RedAlert(){
        i = 3;
        System.out.println("Call constructor class RedAlert ! Variable i = " + i);
    }

    public void print(){
        System.out.println("Red alert ! Type: " + i);
    }
}

class GreenAlert extends Starship3{

    GreenAlert(){
        i = 1;
        System.out.println("Call constructor class GreenAlert ! Variable i = " + i);
    }

    public void print(){
        System.out.println("Green alert ! Type: " + i);
    }
}

class YellowAlert extends Starship3{

    YellowAlert(){
        i = 2;
        System.out.println("Call constructor class YellowAlert ! Variable i = " + i);
    }

    public void print(){
        System.out.println("Yellow alert ! Type: " + i);
    }
}