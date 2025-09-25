package array;

import java.util.Arrays;

public class SumOfElements {

	public SumOfElements() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String [] args) {
		int []arr= {1,2,3,4,5};
		int sum = 0;
		for(int i = 0 ; i<arr.length;i++) {
			sum+=arr[i];
	
		}
		System.out.print(Arrays.toString(arr));
		System.out.println(sum);
		
	}
}

