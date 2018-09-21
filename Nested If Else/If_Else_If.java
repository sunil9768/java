// if-else-if
import java.util.Scanner;
class If_Else_If
   {
      public static void main (String ...w)
	    {
		   int a;
		   Scanner sc=new Scanner(System.in);
		System.out.println("enter age of person:=");
		a=sc.nextInt();
		if(a>18 && a<40)
		   System.out.println("entered age is between 18 and 40");
		else if(a>40 && a<80)
		    System.out.println("entered age is between 40 and 80");
	    else
		    System.out.println("entered age is not valid");
		}
	}