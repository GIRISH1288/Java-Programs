package array;

import java.util.Arrays;

public class Subsequence {

	public Subsequence() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int []arr = {1,5,2,3,2,1};
		
		System.out.println(lps(arr));
	}
	
  public static int lps (int []arr) {
	  int longest = 1;
	 for(int i = 0 ; i<arr.length;i++) {
		
		 for(int j = i ; j<arr.length;j++) {
			 if(ispalindromic(arr,i,j)) {
				 if((j-i+1) >longest) {
					 longest = j-i+1;
				 }
				 
			 }
		 }
	 }
	 return longest ;
  }
	
	
	
	
	
	 public static boolean ispalindromic(int[] arr, int start , int end) {
	while(start<end) {
		if(arr[start] !=arr[end]) {
			return false;
		}
		start++;
		end--;
	}	
		
		 
	return true;
		 
	    }

}  
 
