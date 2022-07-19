/* Take array of n numbers from user , now modify array so positive and negative  numbers are set in alternate position,
 
input ->   1   3   -4    5   -6   23    -45    67    43   44   56   -90   100
output->   1  -4   3    -6   5   -45     23   -90   67   43   44    56    100

input->   1    2   3   4    5     -1    -2    -3   -4    -5 
output->   1  -1   2   -2    3    -3     4    -4     5    -5*/

package Task8;

import java.util.Scanner;

public class AlternatePos {
	static void alter(int a[]) {
		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				if (a[i] < 0) {
					for (int j = i + 1; j < a.length; j++) {
						if (a[j] > 0) {
							int temp = a[i];
							a[i] = a[j];
							a[j] = temp;

						}
					}
				} else {
					for (int j = i + 1; j < a.length; j++) {
						if (a[i] > a[j] && a[j] > 0) {
							int temp = a[i];
							a[i] = a[j];
							a[j] = temp;
						}
					}
				}
			} else {
				if (a[i] > 0) {
					for (int j = i + 1; j < a.length; j++) {
						if (a[j] < 0) {
							int temp = a[i];
							a[i] = a[j];
							a[j] = temp;
							break;
						}
					}
				}
			}
		}
		System.out.println("Output---->");
		for (int k = 0; k < a.length; k++) {
			System.out.print(a[k] + ",");
		}
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the Size of the Array");
			int size = sc.nextInt();
			int[] arr = new int[size];
			System.out.println("Enter the Elements of Array");
			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println("Input---->");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			alter(arr);
		}

	}
}
