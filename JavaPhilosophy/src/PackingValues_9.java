class PackingValues_9{	
	
	public static void main(String[] args){
		int a = PackingValues_9.packingValues(1, 2L, 3f, 4d, true, (byte)127, (short)7, 'A');
		System.out.println(a + " - Распаковался Integer");
		}

	public static int packingValues(Integer i, Long l, Float f, Double d, Boolean b, Byte bt, Short s, Character c){
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(b);
		System.out.println(bt);
		System.out.println(s);
		System.out.println(c);
		return i;
	}
}

