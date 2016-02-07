import java.util.Scanner;
class BubbleSort {
	public static void main(String ...k){
		Scanner sc = new Scanner(System.in);
		int i, temp, j;
		//create a flag
		boolean flag = true;
		int a[] = new int[5];
		System.out.println("Enter the values:");
		for(i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		//iterate over array until it's length AND flag is true
		for(j = 0; j < a.length && flag; j++) {
			//mark flag false
			flag = false;
			for(i = 0; i < a.length - 1; ++i){
				if(a[i] > a[i+1]) {
					flag = true;
					temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
				}
			}
			/* If after complete iteration of array we cannot find element to swap
			 * it means we have sorted array and we can break our outer loop. So the
			 * best case performence will be O(N) not O(N^2)
			 */
			if(!flag)
				break;
		}
		for(i = 0; i < a.length; i++)  {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}
