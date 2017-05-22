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

public class HorrorShow12{
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
        HorrorShow12 horrorShow = new HorrorShow12();
        DangerousMonster dangerousMonster = horrorShow.dangerousMonster();
        u(dangerousMonster);
        v(dangerousMonster);
        Vampire vlad = horrorShow.vampire();
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