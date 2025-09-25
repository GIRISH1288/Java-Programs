package array;

public class FindSecondmin {

public static void main(String[] args) {
	
	int []arr= {10,20,10,20,-9,  0,80,30,10};
	
	 int min = Integer.MAX_VALUE;
	 int secondmin= Integer.MAX_VALUE;
	 for(int i = 0 ; i<arr.length ; i++) {
		 if(arr[i]<min) {
			 secondmin = min ;
			 min = arr[i];
		 }
		 else if (arr[i] < secondmin && arr[i] != min ) {
			  secondmin= arr[i];
		 }
	
	 
	 }
	 System.out.println("MIn :"+min);
	 System.out.println("second min :"+ secondmin);
}

}
