package array;

import java.util.Arrays;

public class InvertedMerge {

	public InvertedMerge() {
		// TODO Auto-generated constructor stub
	}
public static void main(String []args) {
	int []arr= {10,20,30,40};
	int []arr2 = {50,60,70,80,90};
	int []arr3 = new int[arr.length+arr2.length];
	
	int g =arr.length-1;
	int p = arr2.length-1;
	//System.out.println(p +"p");
for(int i = 0 ; i<arr3.length;i++) {
	if(i<arr.length) {
		arr3[i]= arr[g--];
	}
	else {
		arr3[i] = arr2[p--];
	}
}
System.out.println(Arrays.toString(arr3));
}
}
