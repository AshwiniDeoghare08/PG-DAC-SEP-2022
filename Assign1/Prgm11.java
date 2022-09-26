// find the smallest of two number
import java.util.*;
class Prgm11{

public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the 3 numbers : ");//int n= 4;
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();

int smaller = (a<b)?((a<c)? a : c) :(b<c)? b:c;
System.out.println(smaller +" is smallest no.");

/*if(a<b)
{
	if(a<c)
		System.out.println(a +" is smaller no.");
	else
		System.out.println(c +" is smaller no.");
}
 else
 {
    if(b<c)
		System.out.println(b +" is smaller no.");
	else
		System.out.println(c +" is smaller no.");

}*/

}
}