/*    
						5
					   4 5
					  3 4 5
				     2 3 4 5								
				    1 2 3 4 5							
*/

import java.util.Scanner;
class AP8{

public static void main (String[]args)
{
    Scanner sc = new Scanner(System.in);
	System.out.print("Enter the no. of rows :");
	int row = sc.nextInt(); 
	
    for(int i=row; i>=1; i--) // row=5
    {   
	    for(int j=1; j<i; j++)// space
		{
		  System.out.print(" ");// single space required
		  
		}
		for(int j=i; j<=row; j++)
		{
		  System.out.print(j+" ");
		  
		}
		System.out.println();
	 
	}

}
}