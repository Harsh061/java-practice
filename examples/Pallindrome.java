
/*
		Program to find number is pallindrome or not

*/

import java.util.Scanner;
class Pallindrome {
	public static void main(String ...k) {
		Scanner sc = new Scanner(System.in);
		int n = 0,x = 0, a = 0, p;
		System.out.println("Enter the number:");
		n = sc.nextInt();
		p = n;
		while(n > 0) {
			x = n % 10;
			a = (a * 10) + x ;
			n = n / 10;
		}
		if(p == a)
			System.out.println("The number is Pallindrome.");
		else
			System.out.println("The number is not pallindrome.");
	}
}