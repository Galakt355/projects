import java.util.*;

public class Gerbil1{
    int gerbilNumber;

    Gerbil1(int i){
        gerbilNumber = i;
    }

    void hop(){
        System.out.println("Get gerbilNumber ! " + gerbilNumber);
    }

    public static void main(String[] args){
        ArrayList<Gerbil1> arrayList = new ArrayList<Gerbil1>();

        for(int i=0; i<3; i++){
            arrayList.add(new Gerbil1(i));
        }

        get(arrayList);
    }

    static void get(ArrayList<Gerbil1> arrayList){
        for(Gerbil1 g : arrayList){
            g.hop();
        }
    }
}