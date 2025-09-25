package array;

public class Palindromic {

	public Palindromic() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		int []arr= {2,4,1,2,1};
		System.out.println(ispalindrome(arr));
	}
	
	
	
	public static int ispalindrome(int []arr) {
		boolean  ispalindrome=true;
		int ct =0;
	for(int i = 0 , j= arr.length-1 ;i <j;i++,j--) {
		 ispalindrome = true;
		if(arr[i] !=arr[j]) {
			ispalindrome= false;
		}
		ct++;
	}
	//System.out.println(ct);
	return ispalindrome ==true?ct:0;
	}

}
