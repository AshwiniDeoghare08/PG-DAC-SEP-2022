// WAP to print even number series 2,4,6,8....
import java.util.*;
class Prgm19{

public static void main(String [] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter range of number : ");
	System.out.println("Enter starting no. and ending no. : ");
	int str = sc.nextInt();
	int end = sc.nextInt();
	System.out.print("print even no series : ");
	/*while(str<=end)
	{
	  if(str%2==0)
	  {
	  System.out.print(str+" ");
	  str++;
	  }
	  
	}
	*/
	for (int i = str; i<=end; i++)
	{
		if(i%2==0)
		 System.out.print(i+" ");
        else
        continue;
	}	
}
}