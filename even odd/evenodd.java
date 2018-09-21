import java.util.Scanner;
class evenodd
 {
    public static void main (String ...x)
	  {
	     int a,m;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the value a:=");
		    a=sc.nextInt();
		if((a&1)==0)
		   System.out.println("entered number is even");
		else
		    System.out.println("entered value is odd");
		}
  }		