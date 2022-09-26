/*
				*****
				****
				***
				**
				*				
							
*/

import java.util.Scanner;
class BP3{

public static void main (String[]args)
{
    Scanner sc = new Scanner(System.in);
	System.out.print("Enter the no. of rows :");
	int row = sc.nextInt(); 
	
    for(int i=1; i<=row; i++) // row=5
    { 
		for(int j=row; j>=i; j--)
		{
		  System.out.print("*");
		  
		}
		System.out.println();
	 
	}

}
}