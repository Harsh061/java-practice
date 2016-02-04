class PallindromeNumberExampleCLI {
	public static void main(String ...k) {
		if(k.length < 1){
			System.out.println("Enter the number");
			System.exit(1);
		}
		else {
			int num = 0, a = 0, temp = 0, x = 0;
			num = Integer.parseInt(k[0]);
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
}