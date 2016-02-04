/*
		Program to calculate average of array using for loop

*/


class AverageValueOfArray {
	public static void main(String ...k) {
		float sum = 0, avg = 0;
		int arr[] = new int[]{1,2,3,4,5};
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		avg = sum / arr.length;
		System.out.println("The average of array is:" +avg);
	}
}