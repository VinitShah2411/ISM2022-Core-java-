/* take an array of 5 numbers. 
    create right shift function which takes 1 argument countShift.
    if countShift is 1 and your array is a = [1,2,3,4,5] 
    output : 5 1 2 3 4 
    
    if countShift is 3 and your array is a = [1,2,3,4,5]
    output: 3 4 5 1 2 
*/


package Task1;

import java.util.Arrays;
import java.util.Scanner;

public class RightShiftarr {
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		int [] a ={1,2,3,4,5};
		System.out.println("Enter the Number You Want To Shift : ");
		int n = sc.nextInt();
		sc.close();
		
		 for(int i = 0; i < n; i++){    
            int j, last; 
            last = a[a.length-1];    
            for(j = a.length-1; j > 0; j--){
                a[j] = a[j-1];    
            }    
            a[0] = last;    
        }       
        System.out.println(Arrays.toString(a));    
	}
}
