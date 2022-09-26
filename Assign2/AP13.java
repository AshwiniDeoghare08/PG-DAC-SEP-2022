/*    
						A
					   B B
					  C C C
				     D D D D								
				    E E E E E							
*/

import java.util.Scanner;
class AP13{

public static void main (String[]args)
{
    Scanner sc = new Scanner(System.in);
	System.out.print("Enter the no. of rows :");
	int row = sc.nextInt(); 
	int alphabet = 65;
	
    for(int i=1; i<=row; i++) // row=5
    {  
	    for(int j=row-1; j>=i; j--)
		{
		  System.out.print(" ");// single space required
		  
		}
		for(int j=1; j<=i; j++)
		{
		  System.out.print((char)alphabet+" ");
		}
		alphabet++;
		System.out.println();
	 
	}

}
}