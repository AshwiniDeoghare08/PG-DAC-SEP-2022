
import java.util.Scanner;
class Pyramid5{

public static void main (String[]args)
{
    Scanner sc = new Scanner(System.in);
	System.out.print("Enter the no. of rows :");
	int row = sc.nextInt(); 
	
    
	    
	    for(int i=row; i>=1; i--) // row=5
       {   
	    // int k= row-1;
	    for(int j=1; j<i; j++)// space
		{
		  System.out.print("  ");// single space required
		  
		}
		for(int j=i; j<=row; j++)
		{
		  System.out.print(j+" ");
		  
		}
	 
	    for(int j=row-1; j>=i; j--)
		{
		 System.out.print(j+" ");
		 
		}
		
		System.out.println();
	 
	}

}
}