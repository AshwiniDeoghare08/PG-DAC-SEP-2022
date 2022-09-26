// check the given no is palindrome or not
import java.util.*;
class Prgm17{

public static void main(String [] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number : ");
	int num = sc.nextInt();
	int originalnum = num; 
	int rev = 0;
	while(num!=0)
	{
		rev = rev*10 + num%10;
		num = num/10;
	}
	if(originalnum == rev)
	  System.out.print(rev + " is palindrome number");
    else
	  System.out.print(rev + " is not palindrome number");

}
}