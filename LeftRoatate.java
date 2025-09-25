package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LeftRoatate {

	public LeftRoatate() {
		// TODO Auto-generated constructor stub
	}
 public static void main(String[] args) {
	 int[] arr= {10,20,30,40,50};
	//System.out.println( Arrays.toString(rotateLeft(arr)) );
	rotateNTimes(arr,1);
}
 
 
 public static int[] rotateLeft(int[]arr  ) {
 	 int temp = arr[0];
 	 for(int i = 0; i<arr.length-1;i++) {
 		 arr[i]=arr[i+1];
 		 
 	 }
 	 arr[arr.length-1]=temp;
 	 return arr ;
 }
 
 public static void rotateNTimes(int []arr , int k) {
	 for(int i = 1; i<=k;i++) {
		 rotateLeft(arr);
	 }
	 System.out.println(Arrays.toString(arr));
 }
}
