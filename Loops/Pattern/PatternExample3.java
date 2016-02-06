
/*
		Program to print :
		55555
		4444
		333
		22
		1

*/

class PatternExample3 {
	public static void main(String ...k) {
		int i = 0, j = 0;
		for(i = 5; i > 0; i--) {
			for(j = 0; j < i; j++){
				System.out.print(+i);
			}
			System.out.println("");
		}
	}
}

