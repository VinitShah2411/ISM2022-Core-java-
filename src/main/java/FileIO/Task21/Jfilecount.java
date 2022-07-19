/*take 1 folder name with user and count how many java files present in that folder. 
if user entered wrong directory handle that scenario with proper message.*/

package FileIO.Task21;

import java.io.File;
import java.util.Scanner;

public abstract class Jfilecount
{
	public static void main(String[] args) 
	{
		int count=0;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter FIle Path");
			String s = sc.next();
			File f = new File(s);
			if(f.isDirectory()==true)
			{
				File[] files  = new File[50];
				files = f.listFiles();
				for(File file:files)
				{
					if(file.getName().endsWith(".java"))
					{
						count++;
					}
				}
				System.out.println("Total Number of Java files:-"+count);
			}
			else
			{
				System.out.println("File Path is not Valid");
			}
		}
	}
}
