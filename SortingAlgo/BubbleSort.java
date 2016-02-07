import java.util.Scanner;
class BubbleSort {
	public static void main(String ...k){
		Scanner sc = new Scanner(System.in);
		int i = 0, temp = 0, j = 0;
		int a[] = new int[5];
		System.out.println("Enter the values:");
		for(i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for(j = 0; j < a.length; j++) {
			for(i = 0; i < a.length; ++i){
				if(a[i] > a[i+1]) {
					temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
				}
			}
		}
		for(i = 0; i < a.length; i++)  {
			System.out.println(+a[i]);
		}
	}
}