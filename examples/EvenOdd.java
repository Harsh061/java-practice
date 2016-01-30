/*
		Program to check the number is even or odd
*/

class EvenOdd {
	public static void main(String ...p) {
		int number = 0;
		if(p.length < 1){
			System.out.println("Enter the number on number plate of car:");
			System.exit(1);
		}
		else {
			number = Integer.parseInt(p[0]);
			if(number % 2 == 0) {
				System.out.println("Sorry you can drive only on Tuesday, Thrusday and Saturday");
			}
			else {
				System.out.println("Sorry you can drive only on Monday, Wednesday and Friday");
			}
		}
	}
}