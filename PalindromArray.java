package array;

public class PalindromArray {

	public PalindromArray() {
		// TODO Auto-generated constructor stub
		
	}

	public static void main(String[] args) {
		int []arr= {5,1,5};
		
		
		int i = 0;
		int j = arr.length-1;
			for(;i<j;i++,j--) {
				if(arr[i]!=arr[j]) {
					break ;
				}
			}
			
		if(i>j || i==j) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
	}

}



