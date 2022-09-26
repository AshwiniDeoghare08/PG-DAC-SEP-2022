//WAP to find given year is leap year or not
import java.util.*;
class Prgm6{

public static void main(String [] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the year : ");
	int y = sc.nextInt();
	
	String year = ((y%4==0)&& !(y%100==0)||(y%400==0)) ? "LEAP YEAR" : "Not leap year";
	System.out.println(y +" is "+ year);
}
}