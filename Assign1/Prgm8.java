// print the digits of a given number
import java.util.*;
class Prgm8{

public static void main(String [] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number : ");
	int num = sc.nextInt();
	System.out.print("Digits in number : ");

	while(num!=0)
	{
		int lastdigit = num%10;
		num = num/10;
		System.out.print(lastdigit +" ");

	}



}
}