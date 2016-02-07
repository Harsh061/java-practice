import java.util.Scanner;
class BubbleSort {
	public static void main(String ...k){
		Scanner sc = new Scanner(System.in);
		int i, temp, j;
		int a[] = new int[5];
		System.out.println("Enter the values:");
		for(i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for(j = 0; j < a.length; j++) {
			for(i = 0; i < a.length - 1; ++i){
				if(a[i] > a[i+1]) {
					temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
				}
			}
		}
		for(i = 0; i < a.length; i++)  {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}
