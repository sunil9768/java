// maximum in three number
import java.util.Scanner;
class max3
  {
    public static void main(String ...x)
	  {
	     int a,b,c;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the value of a,b,c=");
		     a=sc.nextInt();
		     b=sc.nextInt();
		     c=sc.nextInt();
		 if(a>b)
		   {
		     if(a>c)
			    System.out.println("max is a"+a);
			else
			   System.out.println("max is c"+c);
			 }
		else
		   {
		     if(b>c)
			    System.out.println("max is b"+b);
			else
			    System.out.println("max is c"+c);
			}
		}
	}
		     