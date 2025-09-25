package array;

import java.util.Arrays;

//here we are give with diff arrys we will sort them with 2  pointer approch
public class TwoPointerMerging {

	public TwoPointerMerging() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		
		int []a = {10,30,50,70,90};
        int []b = {20,40,60,80,100,110,120,150};
        merge(a,b);
	}
		
	public static void merge(int a[] , int []b) {
		int []ans = new int [a.length+b.length];
		
		int i =0 ;
		int av = 0;
		int bv = 0;
		
		while (av<a.length && bv<b.length) {
			if(a[av] <b[bv]) {
				ans[i] = a[av];
				av++;
			
			}
			else {
				ans[i] = b[bv] ;
				bv++;
			}
			i++;
			
		}
		int k = a.length<b.length?a.length:b.length;
		if(a.length>b.length) {
			while( av<a.length) {
				ans[i++] = a[av++];
			}
		}
		else {
			while(bv <b.length) {
				ans[i++] =b[bv++];
			}
		}
		
		
		System.out.println(Arrays.toString(ans));
		
	}

}
/*
 
	
 */