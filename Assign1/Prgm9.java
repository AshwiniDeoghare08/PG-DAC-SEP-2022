// WAP to find all factors of given numbers
import java.util.*;
class Prgm9{

public static void main(String [] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter number : ");
	int n = sc.nextInt();
	
	for(int i=1; i<=n ; i++)
	{
	  if(n%i==0)
	  System.out.print(" "+i);
    }
	
	
	 
}
}