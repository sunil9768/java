//cheack  prime //
import java.util.Scanner;
class prime
 {
    public static void main (String arrs[])
	  {
	    int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the value of number which u want to check");
		n=sc.nextInt();
		for(i=2;i<=n/2;i++)
		{
		   if(n%i==0)
		     {
				 
			   System.out.println("entered number is not prime");
			  break;
                         }
                  }
		   if(i>n/2)
		     {
			    System.out.println("entered number is prime");
                             
			 }
			 
		}
	
}	