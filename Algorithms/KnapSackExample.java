import java.util.Scanner;

class Item {
    int value, weight;
    float ratio;
}

class KnapSack {
	public static void main(String ... k) {
		Scanner sc = new Scanner(System.in);
		int number, capacity;
		float profit = 0;
		System.out.println("Enter total number of items");
		number = sc.nextInt();
		Item items[] = new Item[number];
		System.out.println("Enter Knapsack Capacity");
		capacity = sc.nextInt();
		System.out.println("Enter weight and value pair");
		for(int i = 0; i < number; ++i) {
			items[i] = new Item();
			items[i].value = sc.nextInt();
			items[i].weight = sc.nextInt();
			items[i].ratio = (float)(items[i].value) / (float)(items[i].weight);
		}

		System.out.println("Ratio of value by weight is");
		for(int i = 0; i < number; ++i)
			System.out.print(items[i].ratio + " ");
		System.out.println();
		
		//Insertion sort perform better here
		for(int i = 0; i < number - 1; ++i) {
			int idx = i;
			float maxratio = items[i].ratio;
			for(int j = i + 1; j < number; ++j) {
				if(maxratio < items[j].ratio) {
					maxratio = items[j].ratio;
					idx = j;	
				}
			}
			if(idx != i) {
				Item ref = items[i];
				items[i] = items[idx];
				items[idx] = ref;
			}
		}

		System.out.println("Ratio of value by weight after sorting is");
		for(int i = 0; i < number; ++i)
			System.out.print(items[i].ratio + " ");
		System.out.println();

		for(int i = 0; i < number && capacity > 0; ++i) {
			if(capacity >= items[i].weight) {
				capacity -= items[i].weight;
				profit += items[i].value;
			} else {
				profit += items[i].value * (capacity / (float)items[i].weight);
				capacity = 0;
			}
		}
		System.out.println("Maximum profit you can get is: " + profit);
		System.out.println();
	}
}
