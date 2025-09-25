package array;

import java.util.Arrays;

public class QuickSort {

	public QuickSort() {
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
	int []arr= {90,20,10,40,50,30,24,10};
	System.out.println(partiton(arr,0,arr.length-1));
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
		 
	
	}
public static void quickSort(int []arr , int start , int end) {
	if(start<end) {
		int index = partiton(arr,start,end);
		quickSort(arr,start,index-1);
		quickSort(arr,index+1,end);		
		
	}
}


public static int partiton(int[]a,int start, int end) {
	int i =start ;
	int j =end;
	int ref = a[start];
	//System.out.println(Arrays.toString(a));
	
	while(i<j) {
		
	while(a[i]<=ref && i<end) {
		i++;
	}
	
	while(a[j]>=ref && j>start) {
		j--;
	}
	 if(i<j) {
		 int temp = a[i];
		 a[i]=a[j];
		 a[j] = temp;
	 }
	
	}
	
	int temp = a[start];
	a[start]= a[j];
	a[j] = temp;
	
	
	
	
	
	return j;
}
}
