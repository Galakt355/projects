import java.util.*;

public class Gerbil17{
    int gerbilNumber;

    Gerbil17(int i){
        gerbilNumber = i;
    }

    void hop(){
        System.out.println("Get gerbilNumber ! " + gerbilNumber);
    }

    public static void main(String[] args){
        Map<Integer, Gerbil17> gerbil17Map = new HashMap<Integer, Gerbil17>();

        for(int i=0; i<3; i++){
            gerbil17Map.put(i, new Gerbil17(i));
        }

        get(gerbil17Map);
    }

    static void get(Map<Integer, Gerbil17> gerbil17Map){
        System.out.println(gerbil17Map.keySet());
        System.out.println(gerbil17Map.values());

        Iterator<Gerbil17> gerbil17Iterator = gerbil17Map.values().iterator();
        while (gerbil17Iterator.hasNext()){
            Gerbil17 gerbil17 = gerbil17Iterator.next();
            if (gerbil17.gerbilNumber == 0){
                gerbil17Iterator.remove();
            }
            gerbil17.hop();
        }

        System.out.println(gerbil17Map.keySet());
        System.out.println(gerbil17Map.values());

        for(Gerbil17 g : gerbil17Map.values()){
            g.hop();
        }
    }
}