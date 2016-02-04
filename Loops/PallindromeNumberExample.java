import java.util.Scanner;
class PallindromeNumberExample {
	public static void main(String ...k) {
		int num = 0, a = 0, temp = 0, x = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		num = sc.nextInt();
		temp = num;
		while(num > 0) {
			x = num % 10;
			a = (a * 10) + x;
			num = num / 10;
		}
		if( temp == a) 
			System.out.println("Number is Pallindrome");
		else
			System.out.println("Number is not pallindrome");
	}
}