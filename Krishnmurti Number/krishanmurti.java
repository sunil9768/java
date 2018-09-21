// check krishanmurti number//
import java.util.Scanner;
class krishanmurti
  {
     public static void main(String ...arrgs)
	  {
	     Scanner sc=new Scanner(System.in);
		int n,f,sum=0,i,m,t;
		   System.out.print("enter number:=");
		   n=sc.nextInt();
		  t=n;
		  while(n!=0)
		    {
			   m=n%10;
			   f=1;
			  for(i=2;i<=m;i++)
			     {
				    f=f*i;
				}
			sum=sum+f;
			n=n/10;
			}
			if(t==sum)
			  {
			    System.out.print("krishanmurti number");
				}
			else
			     {
				    System.out.print("not krishanmurti number");
					}
			}
}			