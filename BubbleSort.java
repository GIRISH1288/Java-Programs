package array;

import java.util.Arrays;

public class BubbleSort {

public static void main(String[] args) {
	int [] arr = {1,2,3,4,5,6,7,8};
	
	int ct =0;
	for(int pass = 0 ; pass <arr.length-1; pass++) {
		boolean ischecked = false;
		
		for(int i = 0 ; i<arr.length-1-pass;i++) {
			
			if(arr[i] >arr[i+1]) {
				
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				ischecked = true;
				
			}
		ct++;
			
			
		}
		if(!ischecked) {
			break;
		}
	}
	 
	System.out.println(Arrays.toString(arr));
	System.out.println(ct);
	
}

}


/*
 * public static void main(String[] args) {
		// TODO Auto-generated method stub

		// [] arr = {90 , 80 ,70 ,60 , 50 ,40 , 30 };
		int [] arr = {60,80, -2,-27,0,38,8, -98, 0,12 };
		int n = 0;
		int ct= 0;

		while (n<arr.length-1) {
			
		for(int i  = 0; i <arr.length -1 ; i++){
			
			boolean b = false;
			if(arr[i] >arr[i+1] ) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp ; 
				b = true ;
			}
			if(!b) {
				continue
				;
			}
			ct++;
			
		
			
		}
		n++;
		
		
	}
		System.out.println(ct);
		System.out.println(Arrays.toString(arr));
	}
	
	

 */
