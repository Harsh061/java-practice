
/*
	Program to calculate area of circle 
*/


import java.util.Scanner;
class AreaOfCircle {
	public static void main(String ...k) {
		Scanner sc = new Scanner(System.in);
		double rad = 0, pi = 3.14, area = 0;
		System.out.println("Enter the radius of circle: ");
		rad = sc.nextDouble();
		area = pi * rad * rad;
		System.out.println("The area of circle is : " +area);
	}
}