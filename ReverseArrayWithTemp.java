package array;
import java.util.Arrays;

public class ReverseArrayWithTemp {

	public ReverseArrayWithTemp() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String []args) {
		int[]arr = {10,20,30,40,50};
		int temp ;
	
		int i =0 ;
		int j = arr.length-1 ;
		for(;i<j;i++,j--) {
			temp = arr[j];
			arr[j]=arr[i];
			arr[i] =temp;
			
		}
		System.out.println(Arrays.toString(arr));
	}

}
