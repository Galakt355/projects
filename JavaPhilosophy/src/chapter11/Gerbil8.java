import java.util.*;

public class Gerbil8{
    int gerbilNumber;

    Gerbil8(int i){
        gerbilNumber = i;
    }

    void hop(){
        System.out.println("Get gerbilNumber ! " + gerbilNumber);
    }

    public static void main(String[] args){
        ArrayList<Gerbil8> arrayList = new ArrayList<Gerbil8>();

        for(int i=0; i<3; i++){
            arrayList.add(new Gerbil8(i));
        }

        get(arrayList);
    }

    static void get(ArrayList<Gerbil8> arrayList){
        Iterator<Gerbil8> gerbil1Iterator = arrayList.iterator();
        System.out.println(arrayList);
        while (gerbil1Iterator.hasNext()){
            Gerbil8 g = gerbil1Iterator.next();
            g.hop();
        }
//        for(Gerbil1 g : arrayList){
//            g.hop();
//        }
    }
}