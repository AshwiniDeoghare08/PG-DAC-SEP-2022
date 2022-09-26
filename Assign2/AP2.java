/*
			A
			A B
			A B C
			A B C D
			A B C D E				
							
*/

import java.util.Scanner;
class AP2{

public static void main (String[]args)
{
    Scanner sc = new Scanner(System.in);
	System.out.print("Enter the no. of rows :");
	int row = sc.nextInt(); 
	//int albhabet = 64;
	
    for(int i=1; i<=row; i++) // row=4
    { 
	    char x = 'A';
		for(int j=1; j<=i; j++)
		{
		  //System.out.print((char)(albhabet+j)+" ");
		  System.out.print(x);
		  x++;
		}
		System.out.println();
	 
	}

}
}