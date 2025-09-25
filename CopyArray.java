package array;

import java.util.Arrays;

public class CopyArray {

	public CopyArray() {
		// TODO Auto-generated constructor stub
	}

public static void main(String[] args) {
int[]arr = {1,2,3,4,5};
int[]arr2 = new int [arr.length];
int i = arr.length-1 ;
int j = 0;

for(;i>=0;i--,j++) {
	arr2[i]= arr[j];
	
}

System.out.println( Arrays.toString( arr2));
//LOGIC 1 :)

int[] irr = {1,2,3,4,5};
int []irr2 = new int[irr.length];

for(int e = 0;e<irr.length;e++) 
{
 irr2[irr.length-1-e] = irr[e];
}
System.out.println( Arrays.toString( irr2));




	
}
}

