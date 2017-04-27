

public class CompareBitwise19{	
	
    static int[] arrayForNumber9 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1};
    static int[] arrayForNumber14 ={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0};

    public static void main(String[] args){

        System.out.println("compareAND: 00000000000000000000000000001000 и (&) 00000000000000000000000000001110");
        compareAND();
        System.out.println(" ");
        System.out.println("compareOR: 00000000000000000000000000001000 или (|) 00000000000000000000000000001110");
        compareOR();
        System.out.println(" ");
        System.out.println("compareXOR: 00000000000000000000000000001000 исключающее или (^) 00000000000000000000000000001110");
        compareXOR();
        System.out.println(" ");
        System.out.println("compareNOT: 00000000000000000000000000001001 не (~)");
        compareNOT();
    }

    static void compareAND(){
        int arrayForReturn[] = new int[32];
        for (int x=0; x<32; x++){
            int val = arrayForNumber9[x] == 1 && arrayForNumber14[x] == 1 ? 1 : 0;
            arrayForReturn[x] = val;
        }
        for (int x=0; x<32; x++){
            System.out.print(arrayForReturn[x]);
        }
    }

    static void compareOR(){
        int arrayForReturn[] = new int[32];
        for (int x=0; x<32; x++){
            int val = arrayForNumber9[x] == 1 || arrayForNumber14[x] == 1 ? 1 : 0;
            arrayForReturn[x] = val;
        }
        for (int x=0; x<32; x++){
            System.out.print(arrayForReturn[x]);
        }
    }

    static void compareXOR(){
        int arrayForReturn[] = new int[32];
        for (int x=0; x<32; x++){
            int val = arrayForNumber9[x] != arrayForNumber14[x] ? 1 : 0;
            arrayForReturn[x] = val;
        }
        for (int x=0; x<32; x++){
            System.out.print(arrayForReturn[x]);
        }
    }

    static void compareNOT(){
        int arrayForReturn[] = new int[32];
        for (int x=0; x<32; x++){
            int val = arrayForNumber9[x] == 1 ? 0 : 1;
            arrayForReturn[x] = val;
        }
        for (int x=0; x<32; x++){
            System.out.print(arrayForReturn[x]);
        }
    }
}