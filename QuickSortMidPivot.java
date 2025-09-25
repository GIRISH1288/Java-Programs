package array;

import java.util.Arrays;

public class QuickSortMidPivot {

	public QuickSortMidPivot() {
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
	int []arr = {10, 80, 30, 90, 40, 50, 70};
	//System.out.println(partition(arr,0,arr.length-1));
	quickSort(arr, 0 , arr.length-1);
	
	System.out.println(Arrays.toString(arr));
}



public static void quickSort(int []arr , int start , int end) {
	if(start<end) { 
	int partion = partition(arr, start,end);	
	quickSort(arr,start,partion);
	quickSort(arr, partion+1,end);
	}
}

public static int partition(int []arr , int start , int end ) {
	int i = start ;
	int j = end ;
	int mid = (start+end )/2;
	int pivot = arr[mid];
	//System.out.println("mid"+mid);
	
while(true) {
	
	while(arr[i]<pivot)i++;
	while(arr[j] >pivot) j--;
	System.out.println(i+":"+j);
	if(i>=j)return j ;
	
	
		int temp = arr[i];
		arr[i] =arr[j];
		arr[j] = temp;
		i++;
		j--;
	
	
}
	
	
	
	
	//return  ;
}

}
//Can also try
/*
 * package array;

import java.util.Arrays;

public class arr1 {

	public arr1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int [] arr = {9,10,6,7,8,4,6,8,5,4,6,8,9,5,3,2,-2,-7,0,8,-9,-199,0};
        //  System.out.println(partition(arr, 0 ,arr.length-1));
          
        //
          
         
          quickSort(arr , 0 , arr.length-1);
          System.out.println(Arrays.toString(arr));
          
         
          
	}
	public static void quickSort(int []arr, int start , int end) {
		if(start<end) {
			int partition = partition(arr,start , end );
			quickSort(arr,start , partition);
			quickSort(arr, partition+1 , end);
			
		}
		return;
		
	}
	
	
	public static int partition(int []arr , int start , int end) {
		int i = start , j = end;
		int ref = arr[(start+end)/2];
		
		while(i<j) {
			while(arr[i]< ref) {
				i++;
			}
			while(arr[j]>ref) {
				j--;
			}
			if(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
			
			}
			
		
		}
		

		
		
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

 
