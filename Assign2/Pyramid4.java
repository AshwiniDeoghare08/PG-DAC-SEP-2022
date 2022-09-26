/*
					*
				   ***
				  *****
				 *******
				*********

*/
import java.util.Scanner;
class Pyramid4{

public static void main (String[]args)
{
    Scanner sc = new Scanner(System.in);
	System.out.print("Enter the no. of rows :");
	int row = sc.nextInt(); 
	
    for(int i=1; i<=row; i++) // row=5
    {   
	    int c = i-1;
	    for(int j=row; j>i; j--)
		{
		  System.out.print("  ");
		  
		}
		for(int j=1; j<=i; j++)
		{
		  System.out.print(j+" ");
		  
		}
		
	    for(int j=0; j<i-1; j++)
		{
	         System.out.print(c+" ");
			 c--;
		}
		System.out.println();
	 
	}

}
}