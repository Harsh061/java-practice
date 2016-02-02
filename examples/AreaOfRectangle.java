
/*
		Prpgram to calculate area of rectangle using command line interface
*/

class AreaOfRectangle {
	public static void main(String ...k) {
		int area = 0, length = 0, breadth = 0;
		if(k.length < 2) {
			System.out.println("Enter the length and breadth of rectangle");
			System.exit(1);
		}
		else {
			length = Integer.parseInt(k[0]);
			breadth = Integer.parseInt(k[1]);
			area = length * breadth;
			System.out.println("Area of rectangle is :" +area);
		}
	}
}
