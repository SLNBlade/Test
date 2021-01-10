package Homework10;

//1.
public class Homework10_01 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			int rd = (int)(Math.random()*100) + 1;
			if (isPrime(rd)) {
				System.out.println(rd + "是質數");
			} else {
				System.out.println(rd + "不是質數");
			}
		}
			
	}
	
	public static boolean isPrime(int num) {
		
		if (num == 1)
			return false;
		
		if (num == 2)
			return true;
		
		int n = (int)Math.ceil(Math.sqrt(num));
		
		for (int i = 2; i <= n; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
}
