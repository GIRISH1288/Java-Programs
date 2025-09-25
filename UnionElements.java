package array;

import java.util.Arrays;

public class UnionElements {

	public UnionElements() {
		// TODO Auto-generated constructor stub
	}
 public static void main(String[] args) {
	//** consider all the values are unique and not repeating :)
	 int []arr = {10,20,30,40};
	 int []arr2 = {30,40,50,60,70};
	 boolean [] b= new boolean[ arr2.length];
	 int inter = 0;
	 
	 
	 for(int i = 0 ; i<arr.length;i++) {
		 for(int j =0 , k= arr2.length-1 ;j<=k; j++ , k--){
			if(arr[i] == arr2[j]) {
				b[j] = true;
				inter++;
			}
			if(arr[i] ==arr2[k] && j!=k) {
				b[k] = true;
				inter++;
			}
			 
			 
		 }
	 }
	 
//	 System.out.println(giveIntersect(arr,arr2));
	 int []og  = new int [(arr.length+arr2.length) -inter];
	 
	 for(int i = 0, j =0 ; i<og.length ; ) {
		 if(i <arr.length) {
			 og[i] = arr[i];
			 i++;
		 }
		  
		 else {
			 if( !b[j]) {
				 og[i++] = arr2[j++];
			 }
			 else {
				 j++;
			 }
			
			
			 
		 }
		 
	 }
	 
	 System.out.println(Arrays.toString(og));
	 

 }
 
 
 
 
 
	 
 }

