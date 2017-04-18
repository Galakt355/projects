public class HelloWorldDataOnliTextStorage{
	public static void main(String[] args){		
		DataOnli dataOnli = new DataOnli();
		System.out.println(dataOnli.stih);
		System.out.println(dataOnli.stih2);		
		
		System.out.println(dataOnli.storage("К звездам я прикасаюсь,"));
	}
	
	static class DataOnli{
		String stih = "Все, что вечно, и все, что мгновенно,";		
		String stih2 = "Припорошено звездной пыльцой.";		
		
		public int storage(String s){
			return s.length() * 2;
		}
	}
}