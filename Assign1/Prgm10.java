// sum of the digits of a given number
import java.util.*;
class Prgm10{

public static void main(String [] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number : ");
	int num = sc.nextInt();
	int sum = 0;
	while(num!=0)
	{
		sum = sum + num%10;
		num = num/10;
	}
	System.out.print("sum of digits = "+sum);



}
}