package array;

import java.util.Iterator;

public class BinarySearchImp {

	public BinarySearchImp() {
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
	
	int []arr= {34,566,32,4,5,-3,0,0,9,7,-456,-4,4};
    int target = 7 ;
    int start = 0;
    int end = arr.length-1;
    int mid = (start+end )/ 2;
  //  System.out.println(start +"," +mid +"," +end);
    while(start<end) {
    	if(target==arr[mid]) {
    		break;
    	}
    	
    	if(target>arr[mid] ) {
    		start =mid+1;
    	}
    	else {
    		 end = mid -1;
    	}
    	mid = (start +end) /2;
    }
    
    if(start>end ) {
    	System.out.println("element not found");
    }
    else {
    	System.out.println("element found at { :"+ mid );
    }
    
}
}
