package array;

public class SmallestcConsequtiveSequence {

	public SmallestcConsequtiveSequence() {
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
	int []arr = {1,2,3,3,3,3,4,4,4,4,5,5,5};
	smallestcons(arr);
	
}

public static void smallestcons(int[] arr) {
int ct = 1 ;
int  element =0;
int min = Integer.MAX_VALUE ;
 
for(int i = 0 ; i <arr.length-1;i++) 
{  //  ct  =1;
	if(arr[i] == arr[i+1]) {
		ct++;
	}
	else {
		if(ct<min && ct>1 ) {
			min = ct;
			element = arr[i-1];
		}
		else {
			ct = 1;
		}
	}
	
	
}
if(ct < min && ct >= 2) {
    min = ct;
    element = arr[arr.length - 1];
}

System.out.println("ct :"  +ct +", :"+min +":min");

System.out.println(min +"min");
System.out.println(element);
}
}
 

/*
 *   // check before reset
            if(currLen < min && currLen > 1) {
                min = currLen;
                element = arr[i-1];
            }
            currLen = 1; // reset
        }
    }

    // check last streak
    if(currLen < min && currLen > 1) {
        min = currLen;
        element = arr[arr.length-1];
    }

    if(min == Integer.MAX_VALUE) {
        System.out.println("No consecutive repeating elements found.");
    } else {
        System.out.println("Min consecutive length = " + min);
        System.out.println("Element = " + element);
    }
}
 */
