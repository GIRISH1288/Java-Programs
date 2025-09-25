package array;

import java.util.Arrays;

public class SingleArrayMerge {

	public SingleArrayMerge() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		int []arr= {1,3,5,7,2,4,6,8};
		int start = 0 ;
		int end =arr.length;
		int mid = (start+end +1)/2;
		merge(arr ,start , mid , end );
	System.out.println(Arrays.toString(arr));
		
	}
	
	public static void merge(int []a, int starter, int mid , int end) {
		int i =0;
		int start = starter;
		int middle = mid;
		
		int []ans = new int [end - starter];
		//System.out.println("mid :" + middle);
		while (start < mid && middle < end){
			
			if(a[start]<a[middle]) {
		
				ans[i++] = a[start++];	
			}
			else {
				
				ans[i++] = a[middle++];
			}
		}
		while(start<mid) {
			ans[i++] =a[start++] ; 
		}
		while(middle<end) {
			ans[i++] = a[middle++];
		}
				
		  // Copy back to original array
		 for(int j = 0; j < ans.length; j++) {
		        a[starter + j] = ans[j];
		    }
	
	}

}

/*int left = start , right = mid-1 , i =0;
		while(left<mid && right< end) {
			if(a[left]<a[right]) {
				ans[i++] = a[left++];
				
			}
			else {
				ans[i++]= a[right++];
			}
		
		}
		while(left<mid) {
			ans[i++] =a[left++];
		}
		
		while(right<a.length) {
			ans[i++] = a[right++];
		}
*/