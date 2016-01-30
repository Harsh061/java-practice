
/*
		Program to calculate factorial
*/

class Factorial {
	public static void main(String ...k) {
		int value = 0, fact = 1;
		if(k.length < 1) {
			System.out.println("Enter the value :");
			System.exit(1);
		}
		else {
			value = Integer.parseInt(k[0]);
			for(int i = 1; i <= value; i++) {
				fact = fact * i;
			}
			System.out.println("Factorial of number is :" +fact);
		}
	}
}