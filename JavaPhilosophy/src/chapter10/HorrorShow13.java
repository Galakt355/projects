interface Monster{
    void menace();
}

interface Lethal{
    void kill();
}

interface DangerousMonster extends Monster{
    void destroy();
}

interface Vampire extends DangerousMonster, Lethal{
    void drinkBlood();
}

class Producer{

    Producer(){
        System.out.println("The constructor fulfills because the class 'HorrorShow13' is extends from 'Producer' !");
    }

    public static HorrorShow13 getHorrorShow13(String str){
        return new HorrorShow13(str){

        };
    }
}

public class HorrorShow13 extends Producer{

    public HorrorShow13(String str){
        System.out.println(str);
    }

    static void u(Monster b){
        b.menace();
    }
    static void v(DangerousMonster d){
        d.menace();
        d.destroy();
    }
    static  void w(Lethal l){
        l.kill();
    }
    static  void vm(Vampire vamp){
        vamp.drinkBlood();
    }

    public static void main(String[] args)
    {
        HorrorShow13 HorrorShow13 = Producer.getHorrorShow13("Graph Dracula producer!");

        DangerousMonster dangerousMonster = HorrorShow13.dangerousMonster();
        u(dangerousMonster);
        v(dangerousMonster);
        Vampire vlad = HorrorShow13.vampire();
        u(vlad);
        v(vlad);
        w(vlad);
        vm(vlad);
    }

    public DangerousMonster dangerousMonster(){
        return new DangerousMonster(){
            public void menace(){}
            public void destroy(){}
        };
    }

    public Vampire vampire(){
        return new Vampire(){
            public void menace(){}
            public void destroy(){}
            public void kill(){}
            public void drinkBlood(){}
        };
    }
}