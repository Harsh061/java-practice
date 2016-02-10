import java.util.Scanner;
class KnapSackExample {
	public static void main(String ...k) {
		Scanner sc = new Scanner(System.in);
		float W = 0F,temp=0F;
		int i,j;
		float w[] = new float[5];
		float v[] = new float[5];
		float p[] = new float[5];
		System.out.println("Enter the weights :");
		for(i=0;i<5;i++){
			w[i] = sc.nextFloat();
		}
		System.out.println("Enter the values :");
		for(i=0;i<5;i++){
			v[i] = sc.nextFloat();
		}
		System.out.println("Enter the capacity:");
		W = sc.nextFloat();
		for(i=0;i<5;i++){
			p[i] = v[i]/w[i];
			System.out.println("The profits are:" +p[i]);
		}
		for(i=0;i<5;i++){
			for(j=0;j<4;j++){
				if(p[j] < p[j+1]){
					temp = p[j];
					p[j]=p[j+1];
					p[j+1]=temp;
				} 
				else
					p[j]=p[j];
			}
		}
		for(i=0;i<5;i++){
			System.out.println("The sorted profits are:" +p[i]);
		}
		for(i=0;i<5;i++){
			W=W-w[i];
			System.out.println("Remaining weight:" +W);
		}
	}
}