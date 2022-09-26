import java.util.Scanner;
class BP13{

public static void main (String[]args)
{
    Scanner sc = new Scanner(System.in);
	System.out.print("Enter the no. of rows :");
	int row = sc.nextInt(); 
	
    for(int i=1; i<=row; i++) // row=5
    { 
	    for(int j=1; j<i; j++)
		{
		  System.out.print("  ");// add two space here to get above pattern
		  
		}
		for(int j=row; j>=i; j--)
		{
		  System.out.print("* ");
		  
		}
		System.out.println();
	 
	}
	for(int i=1; i<=row; i++) // row=5
    { 
	    for(int j=row; j>i; j--)
		{
		  System.out.print("  ");
		  
		}
		for(int j=1; j<=i; j++)
		{
		  System.out.print("* ");
		  
		}
		System.out.println();
	 
	}

}
}