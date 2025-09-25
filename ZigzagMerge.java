package array;

import java.util.Arrays;

public class ZigzagMerge {

	public ZigzagMerge() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String []args) {
		int []a= {1,2,3,4,5,6,7,8,9};
		int []b = {10,20,30,40};
		int []arr = new int[a.length+b.length];
		
		int i = (a.length <b.length ? a.length:b.length ) ;
		
	
		System.out.println(i);
		int m = 0 ;
		for(int k = 0 ; k <arr.length; k++) {
			if(k<i) {
				arr[m]=a[k];
				arr[m+1]= b[k];
				m+=2;
			}
			else if(m<arr.length){
				
				arr[m++] = a[k];
				
				
				
			}
			
		}
	 
		
		
		System.out.println(Arrays.toString(arr));
		
		
	
	
	}
	}
	
		


/*
 * for(int i = 0 ; i <arr3.length;i++) {
		if( i%2==0  && g<arr.length ) {
			arr3[i]=arr[g++];
		}
		else if(i%2!=0 && p<arr2.length) {
			arr3[i] = arr2[p++];
			
		}
		else {
			
			if(g<arr.length) {
				arr3[i] = arr[g++];
				
			}
			else if (p<arr2.length){
				arr3[i] = arr2[p++];
			}
			
				
		}
		
		
		}
 */




