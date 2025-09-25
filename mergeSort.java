package array;

import java.util.Arrays;

public class mergeSort {

	public mergeSort() {
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
	int[]arr = {4,3,3,6,4,2,5,8,1,0,2};
	
	mergeSort(arr,0,arr.length-1);
	System.out.println(Arrays.toString(arr) );
	
	
}


public static void mergeSort (int[]a , int start , int end ) {



if(start<end) {
	int  mid = (start +end)/2;
mergeSort(a,start,mid);
mergeSort(a,mid+1,end);
merge(a,start,mid,end);


}

	
} 




public static void merge (int[]a , int start , int midd , int end ) {
	int i =start ;
	int m = midd+1;
	int s = start;
int [] ans= new int [a.length];

while(s<=midd && m<=end) {
	if(a[s]<=a[m]) {
		ans[i++] = a[s++];
	}
	else {
		ans[i++] = a[m++] ;
	}
	
}
while(s<=midd) {
	ans[i++] = a[s++];
}
while(m<=end) {
	ans[i++] = a[m++];
}

for(int j = start ; j<=end;j++) {
	a[j] = ans[j];
}
System.out.println(Arrays.toString(a));
}
}
