package lesson07;

public class Number {
	private int number;
	
	public Number() {
		
	}
	
	public Number(int number) {
		this.number = number;
	}
	
	public int get(){
		return number;
	}
	
	public int add(Number num) {
		 return this.number + num.number;
	}
	
	public int sub(Number num) {
		return this.number - num.number;
	}
	
	public int mul(Number num) {
		return this.number * num.number;
	}
	
	public int div(Number num) {
		return this.number / num.number;
	}
	
	public int pow(Number exponent) {
		return (int)Math.pow(this.number, exponent.number);
	}
	
	public int fact() {
		int tmp = 1;
		for(int i = 1 ;i <= this.number; i++)
			tmp = tmp * i;
		return tmp;
	}
	
	public int mod(Number num) {
		return this.number % num.number;
	}
	
	public static void main(String[] args) {
		Number num = new Number(5);
		Number num2 = new Number(3);
		
		
		System.out.println(num.mod(num2));
	}
	
	

}
