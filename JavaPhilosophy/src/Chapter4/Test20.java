

public class Test20{	
	
    
	
    public static void main(String[] args){

        System.out.println(test(10, 5, 3, 4));
        System.out.println(test(3, 5, 3, 4));
        System.out.println(test(4, 5, 3, 4));
		
    }

    static int test(int testval, int target, int begin, int end){
		if(testval < begin){
			System.out.println("���祭�� - testval(" + testval + "): �� �ਭ������� ���������: �� " + begin + " �� " + end);
		}
		else if(testval > end){
			System.out.println("���祭�� - testval(" + testval + "): �� �ਭ������� ���������: �� " + begin + " �� " + end);
		}
		else{
			System.out.println("���祭�� - testval(" + testval + "): �ਭ������� ���������: �� " + begin + " �� " + end);
		}
		
        if(testval > target){
			return +1;
		}
		else if(testval < target){
			return -1;
		}
		else{
			return 0;
		}
    }
    
}