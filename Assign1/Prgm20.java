// / WAP to print even number series 1,3,5,7....
import java.util.*;
class Prgm20{

public static void main(String [] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter range of number : ");
	System.out.print("Enter starting no. and ending no. : ");
	int str = sc.nextInt();
	int end = sc.nextInt();
	System.out.print("print odd no series : ");
	while(str<=end)
	{
	  if(str%2==0)
	  {
	   str++;
	  }
	  System.out.print(str+" ");
	  str++;
	}
	
}
}