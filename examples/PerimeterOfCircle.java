/*
	Program to calculate Perimeter of Circle
*/

import java.util.Scanner;
class PerimeterOfCircle {
	public static void main(String ...k) {
		Scanner sc = new Scanner(System.in);
		double perimeter = 0, pi = 3.14, rad = 0;
		System.out.println("Enter the radius of circle :");
		rad = sc.nextDouble();
		perimeter = 2 * pi * rad;
		System.out.println("The perimeter of circle is :" +perimeter);
	}
}