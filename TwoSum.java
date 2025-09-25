package array;

public class TwoSum {

	public static void main (String[]args) {
		
		System.out.println("hio");
			// TODO Auto-generated constructor stub
			int [] arr= {1,24,4,5,7,5,3,3,7,78,3,2,3,4,1,3,5,6};
			 int target = 5;
	         for(int i=0 ; i<arr.length;i++) {
	      	  for(int j = 0 ; j<arr.length;j++) {
	      		  
	      		  if(i!=j && arr[i]+arr[j]==target) {
	      			  System.out.println(i +","+j);
	      			  return;
	      		    }
	        }
	    }
	         
	}
      	  
	

}
