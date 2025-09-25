package array;

public class LongestRepeating {
// search for Longest Repeating sequence :) eg 1,1,1,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,,5          ans is 5 
	public LongestRepeating() {
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
	int []arr = {1,1,2,2,2,3,3,3,3,4,4,4,4,4,4};
	longestReapeating(arr);
}

public static void longestReapeating(int []arr) {
	int max =0;
	int ct = 0;
	
	int element= 0;
	
	for(int i =0 ; i<arr.length-1;i++) {
		
		if(arr[i] ==arr[i+1]) {
			ct++;
		}
		else {
			ct =1;
		}
	if(ct>max) {
		max = ct;
		element = arr[i+1];
		//System.out.println(i +"i");
		}
		
	}
	System.out.println(max + "  :max");
	System.out.println(element);

}
}
