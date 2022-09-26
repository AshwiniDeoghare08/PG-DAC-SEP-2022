// WAP to find the GCD of two given number
import java.util.*;
class Prgm14{

public static void main(String [] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter 2 numbers : ");
	int x = sc.nextInt();
	int y = sc.nextInt();
	int gcd=1;
	for(int i=1; i<=x && i<=y; i++)
	{
	  if(x%i==0 && y%i==0)
	   gcd = i;
    }
	
	 System.out.print("GCD = " + gcd);
}
}