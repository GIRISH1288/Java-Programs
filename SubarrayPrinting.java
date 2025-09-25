package array;

import java.util.Arrays;

public class SubarrayPrinting {

public static void main(String[] args) {
	
	int [] arr = {1,2,3,4,5};
  for (int i = 0; i < arr.length; i++) {
	 for (int j = i; j < arr.length; j++) {
		range(arr,i,j);
	}
  }
}



public static void range(int []arr , int start , int end) {
	int []ans= new int[end - start];
	//System.out.println(ans.length);
	int p= end-ans.length;
	
	for (int i =0; i<end ; i++) {
		
		 ans[p++]=arr[i];		
	  	}
	
	System.out.println(Arrays.toString(ans));
}
}
