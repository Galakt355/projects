import java.util.ArrayList;

class AllTheColorsOfTheRainbowEleven{
	
	//Значение цвета по умолчанию
    int anIntegerRepresentingColors = 35;
	
	void changeTheHueOfTheColor(ArrayList<Integer> arrayList){
		
		if (arrayList.isEmpty()){			
            System.out.println((char) 27 + "[" + anIntegerRepresentingColors + "m" + "Цвета радуги можно задать из консоли как параметры запуска в диапазоне от 30 до 37 через пробел любое количество раз" + (char)27 + "[0m");
        }
		
        for(int numberColor: arrayList){
            if(30 <= numberColor && numberColor <= 37){
                System.out.println((char) 27 + "[" + numberColor + "m" + "Цвет радуги !" + (char)27 + "[0m");
            }
			else{
                System.out.println("Значение не попадает в диапазон и цвет остается стандартным !");
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

