import java.util.Scanner;

public class Moveneg 
{
	int n;
	void check(int a[]) 
	{
		int j=0,temp=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]>0)
			{
				temp = temp + a[i];
				a[i] = a[j];
				a[i] = temp;
				
			}
		}
	}
	
	void Shift()
	{
		
	}
	
	
	
	
	public static void main(String[] args) 
	{
		int arr[] = {1,3,-4,5,-6, 23,-45, 67,43,44,56,-90,100};
		int n = arr.length;
		Scanner sc = new Scanner(System.in);

		
	
		
		
	}

}
