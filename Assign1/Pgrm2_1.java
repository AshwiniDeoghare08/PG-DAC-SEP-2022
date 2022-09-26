// factorial of number take n0 from user

import java.util.*;

class Pgrm2_1{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int num = sc.nextInt();

int i, fact;
fact=1;

for (i=1; i<=num ; i++)
{
fact = fact * i;

}
System.out.println("factorial of given number is " + fact);

}


}