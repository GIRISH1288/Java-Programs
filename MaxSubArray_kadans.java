package array;

import java.util.Arrays;

public class MaxSubArray_kadans {
	public static void main(String[] args) {
	
		int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
	   maxSum(arr);
	}

	public static void maxSum(int[]ar) {
		int ctsum=ar[0];
		int maxsum=ar[0];
		int start =0,end=0;
		
		
		for (int i = 1; i < ar.length; i++) {
		     if ( ctsum+ar[i]>ar[i])	 {
				 ctsum+=ar[i];
			 }
		     else {
		    	 start=i;
		    	 ctsum=ar[i];
		     }
		     
		    if (ctsum>maxsum) {
		    	end =i;
				maxsum=ctsum;
				
			}
		     
		}
		System.out.println("Maxsum  "+ maxsum);
		  System.out.println(Arrays.toString(subArray(ar, start, end)));
	}

		
	public static int[] subArray(int[] ar , int start, int end) {
		int[]ans = new int[end-start+1];
	    for (int i = start; i <=end; i++) {
			ans[i-start]=ar[i];
		}
	    return ans;	}

}
