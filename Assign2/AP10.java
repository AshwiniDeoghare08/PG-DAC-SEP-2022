/*    
						E
					   E D
					  E D C
				     E D C B								
				    E D C B A							
*/

import java.util.Scanner;
class AP10{

public static void main (String[]args)
{
    Scanner sc = new Scanner(System.in);
	System.out.print("Enter the no. of rows :");
	int row = sc.nextInt(); 
	
    for(int i=1; i<=row; i++) // row=5
    {   int c = 64+row;
	    for(int j=row-1; j>=i; j--)
		{
		  System.out.print(" ");// single space required
		  
		}
		for(int j=1; j<=i; j++)
		{
		  System.out.print((char)c+" ");
		  c--;
		}
		System.out.println();
	 
	}

}
}