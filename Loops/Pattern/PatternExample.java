
/*
		Program to print :
		0
		01
		012
		0123
*/


class PatternExample {
	public static void main(String ...k) {
		int i =0, j = 0;
		for(i = 0; i < 5; i++) {
			for(j = 0; j < i; j++){
				System.out.print(+j);
			}
			System.out.println("");
		} 
	}
}