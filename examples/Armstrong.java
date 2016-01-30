
/*
		Program to find number is armstrong or not
*/

import java.util.Scanner;
class Armstrong {
	public static void main(String ...k) {
		Scanner sc = new Scanner(System.in);
		int n = 0,x = 0, a = 0, p, s = 0;
		System.out.println("Enter the number:");
		n = sc.nextInt();
		p = n;
		while(n > 0) {
			x = n % 10;
			a = x * x * x;
			s = s + a;
 			n = n / 10;
		}
		if(p == s)
			System.out.println("The number is Armstrong.");
		else
			System.out.println("The number is not Armstrong.");
	}
}