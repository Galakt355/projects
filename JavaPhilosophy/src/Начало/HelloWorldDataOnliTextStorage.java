public class HelloWorldDataOnliTextStorage{
	public static void main(String[] args){		
		DataOnli dataOnli = new DataOnli();
		System.out.println(dataOnli.stih);
		System.out.println(dataOnli.stih2);		
		
		System.out.println(dataOnli.storage("� ������� � �ਪ�����,"));
	}
	
	static class DataOnli{
		String stih = "��, �� ��筮, � ��, �� ���������,";		
		String stih2 = "�ਯ��襭� �������� ���殩.";		
		
		public int storage(String s){
			return s.length() * 2;
		}
	}
}