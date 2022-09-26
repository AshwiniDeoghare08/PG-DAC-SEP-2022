// how to add two numbers without using the arithmetic operator
import java.util.*;
class Prgm12{

public static void main(String [] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter 2 numbers : ");
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	
	for(int i=1; i<=num2; i++)
	 num1++;
	 System.out.print("sum of two numbers = "+ num1);
}
}