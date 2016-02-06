
/* 
		Program to print :
		55555
		 4444
		  333
		   22
		    1
*/

class PatternExample5 {
	public static void main(String ...p) {
	int i = 0, j = 0, k = 0;
			for(i = 5; i >= 1; i--){
				for( j = i; j >= 1; j--){
					System.out.print(+i);
				}
				System.out.println("");
				for(k = 5; k >= i; k--){
					System.out.print(" ");
				}
			}
		
	}
}