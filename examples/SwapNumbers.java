
/*
	Program to swap two numbers 
*/	

class SwapNumbers {
	public static void main(String ...k) {
		int number1 = 0, number2 = 0, temp = 0;
		if(k.length < 1){
			System.out.println("Enter the numbers");
			System.exit(1);
		}
		else {
			number1 = Integer.parseInt(k[0]);
			number2 = Integer.parseInt(k[1]);
			System.out.println(" The number1 before swap is :" +number1);
			System.out.println(" The number2 before swap is :" +number2);
			temp = number1;
			number1 = number2;
			number2 = temp;
			System.out.println(" The number1 after swap is :" +number1);
			System.out.println(" The number2 after swap is :" +number2);
		}
	}
}