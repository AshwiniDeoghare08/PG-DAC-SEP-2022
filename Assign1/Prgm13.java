// WAP to reversr a number
import java.util.*;
class Prgm13{

public static void main(String [] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number : ");
	int num = sc.nextInt();
	int rev = 0;
	while(num!=0)
	{
		rev = rev*10 + num%10;
		num = num/10;
	}
	System.out.print("Reverse of given no. is : "+rev);



}
}