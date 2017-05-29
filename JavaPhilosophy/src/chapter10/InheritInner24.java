class WithInner{
    class Inner{
        Inner(int i){
            System.out.println("Get Inner constructor ! Internal class constructor argument: " + i);
        }
    }

    class Inner2{
        Inner2(String i){
            System.out.println("Get Inner constructor ! Internal class constructor argument: " + i);
        }
    }
}

public class InheritInner24 extends WithInner.Inner{
    InheritInner24(WithInner wi){
        wi.super(7);
    }

    class InheritInner2 extends WithInner.Inner2{
        InheritInner2(WithInner wi){
            wi.super("Inner2 !");
        }
    }

    public static void main(String[] args){
        WithInner wi = new WithInner();
        InheritInner24 ii = new InheritInner24(wi);
        InheritInner24.InheritInner2 ii2 = ii.new InheritInner2(wi);
    }
}