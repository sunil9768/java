//swap two number using bitwise operator
import java.util.Scanner;
class swap_bitwise
  {
    public static void main (String ...x)
	   {
	     int a,b;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the value of a and b");
	   a=sc.nextInt();
	   b=sc.nextInt();
	      a=a^b;
	      b=a^b;
	      a=a^b;
	   System.out.println("after swaping:");
	   System.out.println("value of a:="+a);
	   System.out.println("value of b:="+b);
	   }
   }
		 