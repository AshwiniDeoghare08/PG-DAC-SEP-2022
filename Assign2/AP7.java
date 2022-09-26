/*    
						1
					   1 2
					  1 2 3
				     1 2 3 4								
				    1 2 3 4 5							
*/

import java.util.Scanner;
class AP7{

public static void main (String[]args)
{
    Scanner sc = new Scanner(System.in);
	System.out.print("Enter the no. of rows :");
	int row = sc.nextInt(); 
	
    for(int i=1; i<=row; i++) // row=5
    { 
	    for(int j=row-1; j>=i; j--)
		{
		  System.out.print(" ");// single space required
		  
		}
		for(int j=1; j<=i; j++)
		{
		  System.out.print(j+" ");
		  
		}
		System.out.println();
	 
	}

}
}