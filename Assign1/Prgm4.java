// swap two numbers without using third variable

 // swap two numbers withot using third variable
import java.util.*;
class Prgm4{

public static void main(String [] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter x = ");
	int x = sc.nextInt();
	System.out.print("Enter y = ");
	int y= sc.nextInt();
	 
	 x = x+y;
     y = x-y;
     x = x-y;
    System.out.print("After swaping x = "+x+ ",y = "+y);	 
	 
	

}
}