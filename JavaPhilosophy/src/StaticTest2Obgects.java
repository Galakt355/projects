class StaticTest2Obgects{
	
	static int i = 47;
	
	public static void main(String[] args){
		Incrementable.increment();
		
		StaticTest2Obgects st1 = new StaticTest2Obgects();
		StaticTest2Obgects st2 = new StaticTest2Obgects();		
		
		System.out.println(StaticTest.i);		
		System.out.println(st1.i);
		System.out.println(st2.i);
		}
					
	static class Incrementable{
		static void increment(){
			StaticTest.i++;
		}
	}
	
}

