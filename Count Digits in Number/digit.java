//count digit using while loop
import java.util.Scanner;
class digit
{
  public static void main (String ...x)
  {
    int a,b=0;
	Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of  a");
      a=sc.nextInt();
	while(a!=0)
	  {
	    a=a/10;
		b++;
	  }
	System.out.println("digits in the given number is"+b);
	}
}