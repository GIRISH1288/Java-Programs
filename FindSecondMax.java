package array;

public class FindSecondMax {

	public static void main(String[] args) {
		int []arr= {10,20,10,20,-9,80,30,10};
		
		 
		 int max = Integer.MIN_VALUE;
		 int secondmax = max -1;
		 
		
		 
		 for(int i = 0 ; i<arr.length; i++) {
			if(arr[i]>max) {
				secondmax = max ;
				max = arr[i];
			}
			else if(arr[i]>secondmax && arr[i]!=max) {
				secondmax = arr[i];
			}
			 }
		 System.out.println(max);
		 System.out.println(secondmax);
		
	}

}
