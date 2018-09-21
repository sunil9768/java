import java.util.Scanner;
class While
   { 
      public static void main (String x[])
	  {
	     int i;
	        Scanner sc=new Scanner(System.in);
		     System.out.print("enter the value of i:=");
		        i=sc.nextInt();
		 while(i>=1)
		   {
		      System.out.println(i);
			  i--;
			}
		}
	}