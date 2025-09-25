package array;

import java.util.Arrays;

public class ReverseWithoutTemp {


	public static void main(String [] args) {
		
	int []arr = {10,20,30,40,50,60,70,80};
	
	for(int i =0 , j = arr.length-1; i<j;i++,j--) {
     arr[i] = arr[i]+arr[j];
     arr[j]=arr[i]-arr[j];
     arr[i]= arr[i]-arr[j];
		
	}
	System.out.print(Arrays.toString(arr));
	
	}
	
	}


/*
 * int a = 10;
		int b= 20;
		a=a*b;
		b=a/b;
		a=a/b;
		
		System.out.println(a +" a");
		System.out.println(b+" b");
		
 */

