/*
			5 4 3 2 1
			5 4 3 2
			5 4 3
			5 4
			5								
							
*/

import java.util.Scanner;
class AP15{

public static void main (String[]args)
{
    Scanner sc = new Scanner(System.in);
	System.out.print("Enter the no. of rows :");
	int row = sc.nextInt(); 
	
 /* for(int i=1; i<=row; i++) // row=5
    {    int c=row;
		for(int j=row; j>=i; j--)
		{
		  System.out.print( c +" ");
		  c--;
		}
		System.out.println();
	 }
*/
    for(int i=1; i<=row; i++) // row=5
    {    
		for(int j=row; j>=i; j--)
		{
		  System.out.print( j +" ");
		  
		}
		System.out.println();
	 }
}
}