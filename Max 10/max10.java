//maximum 10 using loop//
import java.util.Scanner;
class max10
 {
    public static void main (String arrs[])
	  {
	    int i,a=0,temp=0;
		Scanner sc=new Scanner(System.in);
		for(i=1;i<=10;i++)
		{
			System.out.println("enter the value of all numer one after one");
			a=sc.nextInt();
		
			if(a>temp)
                 temp=a;			
		}			 
		     System.out.println("large is "+temp);				
   		
	}
}	