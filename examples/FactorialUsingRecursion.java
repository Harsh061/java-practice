
/*	
		Program to calculate factorial using recursion	
*/

class FactorialUsingRecursion {
	public static void main(String ...k) {
		int value  = 0, result = 0;
		if(k.length < 1) {
			System.out.println("Enter the value");
			System.exit(1);
		}
		else{
			value = Integer.parseInt(k[0]);
			result = fact(value);		
			System.out.println("The factorial of number using recursion is :" +result);
		}
	}
	static int fact(int b) {
		if(b<=1)
			return 1;
		else
			return b * fact(b-1);
	}
	
}