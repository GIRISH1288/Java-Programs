package array;

import java.util.Arrays;

public class RoateRigth {

	public RoateRigth() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
	 int []arr= {10,20,30,40,50};
	 rotateKtimes(arr,1);
	}
	public static int[] rotateRight(int []arr ){
		int temp= arr[arr.length-1];
		int k = arr.length-1;
		for(;k>0;k--) {
			arr[k]=arr[k-1];
			
		}
		arr[0]=temp;
		
		return arr;	
		}
	public static void  rotateKtimes(int []arr, int n) {
		while(n>0) {
			rotateRight(arr);
			n--;
		}
		System.out.println(Arrays.toString(arr));
	}
		
	}


