class ArmstrongNumberExampleCLI {
	public static void main(String ...k) {
		if(k.length < 1){
			System.out.println("Enter the number");
			System.exit(1);
		}
		else {
			int num = 0, a = 0, temp = 0, x = 0, s = 0;
			num = Integer.parseInt(k[0]);
			temp = num;
			while(num > 0) {
				x = num % 10;
				a = x * x * x;
				s = s + a;
				num = num / 10;
			}
			if( temp == s) 
				System.out.println("Number is Armstrong");
			else
				System.out.println("Number is not Armstrong");
			
			}
		}
}