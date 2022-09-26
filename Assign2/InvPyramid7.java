/*    
5 5 5 5 5
 4 4 4 4
  3 3 3
   2 2
    1   
*/

import java.util.Scanner;
class InvPyramid7{

public static void main (String[]args)
{
    Scanner sc = new Scanner(System.in);
	System.out.print("Enter the no. of rows :");
	int row = sc.nextInt(); 
	
    for(int i=row; i>=1; i--) // row=5
    { 
	    for(int j=i; j <=row-1 ; j++)
		{
		  System.out.print(" ");// 
		  
		}
		for(int j=i; j>=1; j--)
		{
		  System.out.print(i+" ");
		  
		}
		System.out.println();
	 
	}

}
}