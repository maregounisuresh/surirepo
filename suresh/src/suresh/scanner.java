package suresh;

import java.util.Scanner;

public class scanner {

	
	private static Scanner s;

	public static void main(String[] args) {
		System.out.println("enter the array size");
		s = new Scanner(System.in);
		int size = s.nextInt();
		int a[] = new int[size];
		System.out.println("Fill Array");
		for (int i=0;i<a.length;i++)
		{
			a[i] = s.nextInt();
		}
		for (int j=0;j<a.length;j++)
		{
			System.out.println(a[j]);
			int largest = a[0];
			for (int k=1;k<a.length;k++)
			{
				if (largest<a[k])
					largest = a[k];
			}
			System.out.println("largest number is"+largest);
		
		}
		
		
			
		
	}

}
