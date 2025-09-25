package array;

import java.util.Arrays;

public class Merge {

	public Merge() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
  int[]arr = {10,20,30,40,50};
  int[]arr2 = {60,70,80,90,1,2,3,4};
  int[]arr3 = new int[arr.length+arr2.length];
 // System.out.println(arr3.length);
  int b = 0;
  
  for(int i = 0;i<arr3.length;i++) {
	  
	  
	  if(i<arr.length) {
		  arr3[i]=arr[i];
	  }
	  else {
		
		  arr3[i]=arr2[b++];
		  
	  }
	
  }
  
  

  System.out.print(Arrays.toString(arr3));
	}

}
