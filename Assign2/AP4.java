/*
			1
			2 2
			3 3 3
			4 4 4 4
			5 5 5 5 5				
							
*/

import java.util.Scanner;
class AP4{

public static void main (String[]args)
{
    Scanner sc = new Scanner(System.in);
	System.out.print("Enter the no. of rows :");
	int row = sc.nextInt(); 
	
    for(int i=1; i<=row; i++) // row=4
    { 
		for(int j=1; j<=i; j++)
		{
		  System.out.print(i+" ");
		  
		}
		System.out.println();
	 
	}

}
}