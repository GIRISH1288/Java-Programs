package array;

import java.util.Arrays;

public class PartPositiveNEgative {

	public PartPositiveNEgative() {
		// TODO Auto-generated constructor stub
		
		
		}
	public static void main(String[] args) {
		int []arr= {0,2,-2,4,-4,6,-4,6,-2,6,7,-10};
		System.out.println(Arrays.toString(part(arr)));
	}
	
	public static int[] part(int []arr) {
		//int []arr2= new int[arr.length];
		int i =0;
		int j =arr.length-1;
		while(i<j) {
	
		  while(arr[i]<0 && i<j ) {
			i++;
		  }
		  
		  while(arr[j]>=0 && j >i) {
			  j--;
		  }

         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
			
			
		}
		
		
		System.out.println(i+","+j);
		return arr;
		
	}

}
