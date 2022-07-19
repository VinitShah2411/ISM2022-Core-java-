/*  Move all the negative elements to one side of the array. 

		input -> 1  3  -4  5  -6   23   -45    67   43   44   56   -90   100
		Output -> 1  3   5    23   67   43    56    100   -4   -6  -45   -90  
 */

package Task6;

import java.util.Scanner;

public class Negarr {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int[] arr = new int[10];
			
			System.out.println("Please Enter the value in array:");
			for (int i = 0; i < arr.length; i++) 
			{
				arr[i] = sc.nextInt();
			}
			
			int[] pos = new int[arr.length];
			int[] temp = new int[arr.length];
			int j = 0;
			int k = 0;
			
			for (int i = 0; i < arr.length; i++) 
			{
				if (arr[i] < 0) 
				{
					temp[j] = arr[i];
					j++;
				} else {
					pos[k] = arr[i];
					k++;
				}
			}
			int z = 0;
			for (int i = k; i < j + k; i++) 
			{
				pos[i] = temp[z];
				z++;
			}

			for (int i = 0; i < pos.length; i++) 
			{
				System.out.print(pos[i] + " ");
			}
		}
		//sc.close();
	}
}
