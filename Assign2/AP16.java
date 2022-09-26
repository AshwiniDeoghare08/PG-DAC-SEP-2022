/*
			5
			5 4
			5 4 3
			5 4 3 2 
			5 4 3 2 1				
							
*/

import java.util.Scanner;
class AP16{

public static void main (String[]args)
{
    Scanner sc = new Scanner(System.in);
	System.out.print("Enter the no. of rows :");
	int row = sc.nextInt(); 
	
  /*
  for(int i=1; i<=row; i++) 
    { 
	    int c=row;
		for(int j=1; j<=i; j++)
		{
		  System.out.print(c+" ");
		  c--;
		}
		System.out.println();
	 
	}
*/	
    for(int i=row; i>=1; i--) 
    { 
	    for(int j=row; j>=i; j--)
		{
		  System.out.print(j+" ");
		  
		}
		System.out.println();
	 
	}
}
}