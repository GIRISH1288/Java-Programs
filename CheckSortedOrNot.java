package array;

public class CheckSortedOrNot {

	public CheckSortedOrNot() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		int []arr = {1,3,4,5,7,9};
		System.out.println(checkforSorted(arr));
	}
	
	
	public static boolean checkforSorted(int []arr) {
		
		 for(int i = 0 ; i <arr.length-1;i++) {
			 if(arr[i] >arr[i+1]) 
				 return false;
			 }
		 return true;
		 
	}

}
