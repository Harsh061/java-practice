import java.util.Scanner;
class KnapSackExample {
	public static void main(String ...k) {
		Scanner sc = new Scanner(System.in);
		float W = 0.0F,temp=0.0F, temp1=0.0F, temp2=0.0F, sum=0.0F;
		int i,j;
		float w[] = new float[5];
		float v[] = new float[5];
		float p[] = new float[5];
		float x[] = new float[5];
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
					
					temp1 = w[j];
					w[j] = w[j+1];
					w[j+1] = temp1;
					
					temp2 = v[j];
					v[j] = v[j+1];
					v[j+1] = temp2;
				} 
			}
		}
		for(i=0;i<5;i++){
			System.out.println("The sorted profits are:" +p[i]);
			System.out.println("The sorted weigths are:" +w[i]);
			System.out.println("The sorted values are:" +v[i]);
		}
		//add condition W > 0 since you cannot add more items then capacity so there is no point
		//running for loop after capacity is full i.e. in our case W = 0
		//for(i=0;i<5;i++){
		for(i = 0; i < 5 && W > 0; ++i) {
			if(W > w[i]) {
				W = W - w[i];
				x[i] = 1;
				System.out.println("Remaining weight:" + W);
				System.out.println("Corresponding value:" + v[i]);
			} else {
				W = W / w[i];
				x[i] = W;
				W = 0;
				System.out.println("Remaining weight:" + W);
				System.out.println("Corresponding value:" + x[i]);
			}
		}
		//same as above there is no point running loop after you encountered x[i] = 0 as we can gurantee that
		//if you find single x[i] = 0 there all the remaining x[i] will be zero.
		for(i=0; i < 5 && x[i] > 0; ++i) {
			sum = sum + v[i] * x[i];
		}
		System.out.println("Optimal value: " + sum);
	}
}
