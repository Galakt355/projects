import java.util.ArrayList;

class AllTheColorsOfTheRainbowEleven{
	
	//���祭�� 梥� �� 㬮�砭��
    int anIntegerRepresentingColors = 35;
	
	void changeTheHueOfTheColor(ArrayList<Integer> arrayList){
		
		if (arrayList.isEmpty()){			
            System.out.println((char) 27 + "[" + anIntegerRepresentingColors + "m" + "���� ࠤ㣨 ����� ������ �� ���᮫� ��� ��ࠬ���� ����᪠ � ��������� �� 30 �� 37 �१ �஡�� �� ������⢮ ࠧ" + (char)27 + "[0m");
        }
		
        for(int numberColor: arrayList){
            if(30 <= numberColor && numberColor <= 37){
                System.out.println((char) 27 + "[" + numberColor + "m" + "���� ࠤ㣨 !" + (char)27 + "[0m");
            }
			else{
                System.out.println("���祭�� �� �������� � �������� � 梥� ��⠥��� �⠭����� !");
            }
        }
    }
	
	public static void main(String[] args){
		
		ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0; i < args.length; i++){
            try
            {
                arrayList.add(Integer.valueOf(args[i]));
            }
            catch (Exception e){
                System.out.println(e);
                continue;
            }
			
            System.out.println("args["+ i +"] : " + args[i]);
        }
		
		AllTheColorsOfTheRainbowEleven rainbow = new AllTheColorsOfTheRainbowEleven();
		rainbow.changeTheHueOfTheColor(arrayList);
	}
		
}

