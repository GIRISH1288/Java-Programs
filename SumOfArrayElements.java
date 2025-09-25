package array;

public class SumOfArrayElements {

	public SumOfArrayElements() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {5,5,5,5,5,5};
		int sum = 0;
		int l =arr.length;
		for(int i = arr.length-1;i>=0;i--) {
			sum+=arr[i];
			System.out.println(arr[i]);

			
		}
		  System.out.println(sum);

	}

}
