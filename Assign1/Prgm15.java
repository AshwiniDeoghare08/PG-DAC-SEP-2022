// WAP to find LCM of two given numbers
import java.util.*;
class Prgm15{

public static void main(String [] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter 2 numbers : ");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int gcd=1;
	int LCM;
	for(int i=1; i<=a && i<=b; i++)
	{
	  if(a%i==0 && b%i==0)
	   gcd = i;
    }
	LCM = (a*b)/gcd;
	
	 System.out.print("LCM= " + LCM);
}
}