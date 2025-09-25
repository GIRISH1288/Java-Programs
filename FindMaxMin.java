package array;

public class FindMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {5,3,2,5,7,9,2,0,-9,-3,23,23,-4,0};
		getMaxMIn(arr);
		

}
 public static void getMaxMIn(int []arr) {
	 
	 if(arr.length<1) {
		 System.out.println("-1");
		 return;
	 }
	 
	 int max = Integer.MIN_VALUE;
	 int min = Integer.MAX_VALUE;
	 for(int i = 0 ; i<arr.length;i++) {
		if(arr[i] > max )
			max = arr[i]; 
		
		 else if(arr[i]<min)
		    min= arr[i];
		 
		
		   
		 }
	 System.out.println("max :" +max +"," +"min :" +min);
	
	

   }
 }
 

