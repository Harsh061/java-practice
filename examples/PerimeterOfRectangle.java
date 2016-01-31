
/*
		Prpgram to calculate perimeter of rectangle using command line interface
*/

class PerimeterOfRectangle {
	public static void main(String ...k) {
		int perimeter = 0, length = 0, breadth = 0;
		if(k.length<1) {
			System.out.println("Enter the length and breadth of rectangle");
			System.exit(1);
		}
		else {
			length = Integer.parseInt(k[0]);
			breadth = Integer.parseInt(k[1]);
			perimeter = 2 * (length + breadth);
			System.out.println("Perimeter of rectangle is :" +perimeter);
		}
	}
}