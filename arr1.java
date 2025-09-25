package array;

import java.util.Arrays;

public class arr1 {

	public arr1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	
		int []arr = {30,80,10,50,70,90,5 ,25};
		
		
  //  System.out.println(partition(arr, 0, arr.length-1));
  
		
          
	}
	public static void quickSort(int[]arr , int start , int end ) {
		
		if (start<end) {
			int pivot =  partition(arr, start , end);
			quickSort(arr, start, pivot-1);
			quickSort(arr, pivot+1,end);
			
		}
	}
	public static int  partition(int[]arr, int start, int end) {
	int pivot = arr[start];
	int i =start , j = end;
	while(i<j) {
		while(i<=end && arr[i]<pivot) {
			i++;
		}
		while(j>=start && arr[j]>pivot) {
			j--;
		}
		if (i<j) {
		 int temp = arr[i];
		 arr[i]=arr[j];
		 arr[j]=temp;
			i++;
			j--;
		}
	
		
	}
	int temp2 = arr[start];
	arr[start]=arr[j];
	arr[j]=temp2;
	
	System.out.println(i+"  , "+j);
	return j;
		
		
	}
	


}


/*
  int []arr2 =new int[4] ;
           System.out.println(arr.toString());
           
           double [] arr3 = new double[6];
           arr3[1]=13;
           System.out.println(arr3[1]);
           
           helper [] h1= new helper[4];
          
           h1[0]= new helper();
         
           
           int target = 4;
    
           for(int i = arr.length-1;i>=0;i--) {
        	   if(i>0) {
        		   System.out.print(arr[i]+",");
        	   }
 
        	   else {
        		   System.out.print(arr[i]);
        	   }
        	 
           }
           System.out.println();
           for(int i = 0 ; i<arr.length; i++) {
        	   if(i<arr.length-1) {
        	   System.out.print(arr[i]+",");
        	   }
        	   else {
        		   System.out.println(arr[i]);
        	   }
           }
 */
