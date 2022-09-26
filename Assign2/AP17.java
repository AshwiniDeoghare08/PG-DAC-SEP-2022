/*
			1
			2 3
			4 5 6
			7 8 9 10
			11 12 13 14 15
*/

import java.util.Scanner;
class AP17{

public static void main (String[]args)
{
    Scanner sc = new Scanner(System.in);
	System.out.print("Enter the no. of rows :");
	int row = sc.nextInt(); 
	int c = 1;
    for(int i=1; i<=row; i++) // row=4
    { 
		for(int j=1; j<=i; j++)
		{
		  System.out.print(c +" ");
		  c++;
		}
		System.out.println();
	 
	}

}
}