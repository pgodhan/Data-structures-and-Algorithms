public class CutRod {

	int findMaxPrice(int price[], int n) {
		int table[] = new int[n + 1];
		int k;

		// Initializing the table to 0
		for (k = 0; k < table.length; k++)
			table[k] = 0;
		//Base case
		if (n <= 0)
			return 0;
		
		int i;
		int maxValue = Integer.MIN_VALUE;
		int temp, sum;

		for (i = 0; i < price.length; i++) {
			temp = 0;
			sum = 0;
			// Keeping track of incremental sum
			for (int j = i; j < price.length; j++) {
				temp = temp + j + 1;
				sum = sum + price[j];
				if (temp <= n) // Checking whether it has crossed the target
					// size or not
				{
					maxValue = Math.max(maxValue, sum);
					table[temp] = maxValue;
				} else
					break; // Break if bound are crossed
			}

		}
		// Return the target value
		return table[n];
	}

	public static void main(String[] args) {
		
		CutRod ob = new CutRod();
		int price[] = new int[5];

		price[0] = 1;// 1
		price[1] = 1;// 2
		price[2] = 2;// 3
		price[3] = 3;// 4
		price[4] = 2;// 5

		System.out.println(ob.findMaxPrice(price, 10));

	}

}
