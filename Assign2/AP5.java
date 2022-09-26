/*
			A
			B B
			C C C
			D D D D
			E E E E E				
							
*/

import java.util.Scanner;
class AP5{

public static void main (String[]args)
{
    Scanner sc = new Scanner(System.in);
	System.out.print("Enter the no. of rows :");
	int row = sc.nextInt(); 
	int albhabet = 65;
	
    for(int i=1; i<=row; i++) // row=4
    { 
		for(int j=1; j<=i; j++)
		{
		  System.out.print((char)albhabet+" ");
		}
		albhabet++;
		System.out.println();
	 
	}

}
}