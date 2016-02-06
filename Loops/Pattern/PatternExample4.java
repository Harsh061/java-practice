
/* 
		Program to print :
		54321
		 4321
		  321
		   21
		    1
*/

class PatternExample4 {
	public static void main(String ...p) {
	int i = 0, j = 0, k = 0;
			for(i = 5; i >= 1; i--){
				for( j = i; j >= 1; j--){
					System.out.print(+j);
				}
				System.out.println("");
				for(k = 5; k >= i; k--){
					System.out.print(" ");
				}
			}
		
	}
}