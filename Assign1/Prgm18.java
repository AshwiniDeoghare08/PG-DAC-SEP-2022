import java.util.*;
class Prgm18{
public static void main(String []args)
{
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter the positive number :");
  int num = sc.nextInt();
  System.out.println("The prime factors = ") ;
  for(int i=2 ; i< num; i++)// 
  {
	   while(num%i==0)
	   {
	   System.out.print(i +" ");
	   num = num/i;
	   }
  }
  /*if(num > 2)
  {
    System.out.println(num);
  } */
   


}
}