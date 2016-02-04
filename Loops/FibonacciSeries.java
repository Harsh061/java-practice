
/*
	Program to show Fibonacci series
*/		

class FibonacciSeries {
	public static void main(String ...k) {
		int a = 0, b = 1, i = 0;
		System.out.println(+a);
		System.out.println(+b);
		while(i < 5){
			a = a + b;
			System.out.println(+a);
			b = a + b;
			System.out.println(+b);
			i++;
		}
	}
}