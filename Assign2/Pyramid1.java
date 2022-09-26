

import java.util.Scanner;
class Pyramid1{

public static void main (String[]args)
{
    Scanner sc = new Scanner(System.in);
	System.out.print("Enter the no. of rows :");
	int row = sc.nextInt(); 
	
    for(int i=1; i<=row; i++) // row=5
    { 
	    for(int j=row; j>i; j--)
		{
		  System.out.print(" ");// single space required
		  
		}
		for(int j=1; j<=i; j++)
		{
		  System.out.print(i+" ");
		  
		}
		System.out.println();
	 
	}

}
}