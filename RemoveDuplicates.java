package array;

import java.util.Arrays;
import java.util.Iterator;

public class RemoveDuplicates {

	public RemoveDuplicates() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		int []arr = {1,2,2,3,3,4,5,5,6,7,7,8};
		removeDup(arr);
		
	}
	
	public static void removeDup(int []arr) {
		int unique=0;
		int []mark = marker(arr);
	 for (int i = 0; i < mark.length; i++) {
		if(mark[i] !=-1) {
			unique++;
		}
	}
	 System.out.println(unique);
	 int []un = new int [unique];
	 int k =0;
	 for(int i= 0;i <mark.length;i++) {
		 
		 if(mark[i] != -1) {
			 un[k++] = arr[i];
		 }
	 }
	 System.out.println(Arrays.toString(un));
	
	}
	
	public static int[] marker(int []arr) {
		int []marker = new int [arr.length] ;
		
		for (int i = 0; i < marker.length; i++) {
			int ct =1;
			
			if(marker[i] != -1) {
			  for(int j =i+1 , k =arr.length-1 ; j<=k ;j++,k-- ) {
					if(arr[i]==arr[j]) {
						ct++;
						marker[j] =-1;
					}
					if(arr[i]==arr[k]) {
						ct++;
						marker[k]=-1;
					}
					
				}
			  marker[i] = ct;
			  //System.out.println(arr[i] +":"+ct);
			}
		}
		return marker;
		//System.out.println(Arrays.toString((marker)));
		
	}	
	 

}
