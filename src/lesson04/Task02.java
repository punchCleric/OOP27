package lesson04;

public class Task02 {
	
	static int summa(int start, int end) {
		if(start == end){
		return end;
		}
		int recResult = summa(start + 1, end);
		int res = start + recResult;
		return res;
	}
	
	static void f(int a, int b) {
		System.out.println(a);
		if(a != b) {
			f(a + 1, b);
		}
		System.out.println(a);
	}
	public static void main(String[] args) {
		//f(1, 10);
		System.out.println(summa(3,3));
	}
}
