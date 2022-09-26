/*
				*
				**
				***
				****
				*****
							
*/

import java.util.Scanner;
class BP1{

public static void main (String[]args)
{
    Scanner sc = new Scanner(System.in);
	System.out.print("Enter the no. of rows :");
	int row = sc.nextInt(); 
	
    for(int i=1; i<=row; i++) // row=4
    { 
		for(int j=1; j<=i; j++)
		{
		  System.out.print("*");
		  
		}
		System.out.println();
	 
	}

}
}