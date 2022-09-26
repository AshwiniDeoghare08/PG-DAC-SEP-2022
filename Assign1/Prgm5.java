// check given number is positive or negative
import java.util.*;
class Prgm5{

public static void main(String [] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter number : ");
	int num = sc.nextInt();
	
	String s = (num >=0) ? "positive" : "Negative";
	
	System.out.println("Given number is "+s);
	
}
}