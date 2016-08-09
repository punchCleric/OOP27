package lesson04;

public class HomeTask01 {
	public static void main(String[] args) {
		//System.out.println(fact(4));
		  System.out.println(pow(4,0));
		 }
		 
		 public static int fact(int i) {
			 if(i == 1) {
				 return i;
			 }
			 return i * fact(i-1);
		 }
		  
		 public static int pow(int n, int m){
		    if(m == 0){
		     return 1;
		    }
		    return n * pow(n, m - 1);
		  }
}
