package array;

import java.util.Arrays;

public class FrequencyOfEachElement {

	public FrequencyOfEachElement() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int [] a = {1,2,2,3,4,4,5,5,6,7,5};
 int [] check = new int[a.length];
for(int i = 0 ; i <a.length; i++) {
	int count = 1 ;
	if(check[i] != -1) {
		
		for(int j = i+1 , k= a.length-1 ; j<=k; j++,k--) {
			if(a[i] == a[j]) {
				count++;
				
				check[j] = -1;
			}
			if(a[i] == a[k] && j!=k) {
				count++;
				
				check[k] = -1;
			}
			
				check[i] = count;
			
			
		}
		System.out.println( a[i]+":"+count);
		//System.out.println( Arrays.toString(check));
	
	}
	
}
 
	}

}
