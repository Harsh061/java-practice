
/*
		Program to print :
		1
		22
		333
		4444
		

*/

class PatternExample2 {
	public static void main(String ...k) {
		int i =0, j = 0;
		for(i = 0; i < 5; i++) {
			for(j = 0; j < i; j++){
				System.out.print(+i);
			}
			System.out.println("");
		} 
	}
}