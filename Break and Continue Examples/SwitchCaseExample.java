
/*
	Java Switch case example
*/

import java.util.Scanner;
class SwitchCaseExample {
	public static void main(String ...k) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		System.out.println("Menu : ");
		System.out.println("1. Factorial");
		System.out.println("2. Prime or Not");
		System.out.println("3. Even or Odd");
		System.out.println("4. Exit");
		n = sc.nextInt();
		switch(n) {
			case 1 : System.out.println("Factorial");
					 break;
			case 2 : System.out.println("Prime or not");
					 break;
			case 3 : System.out.println("Even or Odd");
					 break;
			case 4 : System.exit(1);
			default: System.out.println("Invalid Option !!");		
		}
	}
}