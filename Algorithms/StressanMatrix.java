import java.util.Scanner;
class StressanMatrix {
	public static void main(String ...k) {
		Scanner sc = new Scanner(System.in);
		int p=0,q=0,r=0,s=0,t=0,u=0,v=0,i=0,j=0;
		int a[][] = new int[2][2];
		int b[][] = new int[2][2];
		int c[][] = new int[2][2];
		System.out.println("Enter the matrix A:");
		for(i=0; i<2; ++i){
			for(j=0;j<2;++j){
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the matrix B:");
		for(i=0; i<2; ++i){
			for(j=0;j<2;++j){
				b[i][j] = sc.nextInt();
			}
		}
		
		p = (a[0][0] + a[1][1]) * (b[0][0] + b[1][1]);
		q = (a[1][0] + a[1][1]) * b[0][0];		
		r = a[0][0] * (b[0][1] - b[1][1]);
		s = a[1][1] * (b[1][0] - b[0][0]);
		t = (a[0][0] + a[1][1]) * b[1][1];
		u = (a[1][0] - a[0][0]) * (b[0][0] + b[0][1]); 
		v = (a[0][1] - a[1][1]) * (b[1][0] + b[1][1]);
		c[0][0] = p + s - t + v; 
		c[0][1] = r + t;
		c[1][0] = q + s;
		c[1][1] = p + r - q + u; 
		System.out.println("Matrix Multiplication is:");
		for(i=0; i<2; ++i){
			for(j=0;j<2;++j){
				System.out.println(+c[i][j]);
			}
		}
		
	}
}