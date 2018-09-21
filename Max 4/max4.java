import java.util.Scanner;
class Max4
{	public static void main(String ...at)
	{	Scanner sc=new Scanner(System.in);
		System.out.println("Enter 4 numbers ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		if(a>b)
		{	if(a>c)
			{	if(a>d)
					System.out.println("Max is "+a);			
				else
					System.out.println("Max is "+d);			
			}
			else
			{	if(c>d)
					System.out.println("Max is "+c);			
				else
					System.out.println("Max is "+d);			
			}
		}
		else
		{	if(b>c)
			{	if(b>d)
					System.out.println("Max is "+b);			
				else
					System.out.println("Max is "+d);			
			}
			else
			{	if(c>d)
					System.out.println("Max is "+c);			
				else
					System.out.println("Max is "+d);			
			}
		}
	}
}