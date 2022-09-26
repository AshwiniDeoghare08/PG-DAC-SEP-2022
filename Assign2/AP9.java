/*    
						A
					   A B
					  A B C
				     A B C D								
				    A B C D E							
*/

import java.util.Scanner;
class AP9{

public static void main (String[]args)
{
    Scanner sc = new Scanner(System.in);
	System.out.print("Enter the no. of rows :");
	int row = sc.nextInt(); 
	
    for(int i=1; i<=row; i++) // row=5
    {  
	    int albhabet = 64;
	    for(int j=row-1; j>=i; j--)
		{
		  System.out.print(" ");// single space required
		  
		}
		for(int j=1; j<=i; j++)
		{
		  System.out.print((char)(albhabet+j)+" ");
		  
		}
		System.out.println();
	 
	}

}
}