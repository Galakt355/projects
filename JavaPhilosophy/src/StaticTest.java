class StaticTest{
	
	static int i = 47;
	
	public static void main(String[] args){
		
		Incrementable.increment();
		System.out.println(StaticTest.i);
		
		}
					
	static class Incrementable{
		static void increment(){
			StaticTest.i++;
		}
	}
	
}

