import java.util.Scanner;
class switchcase
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int date=0;
		System.out.println("enter a date of october month from 18 to 26");
		date=sc.nextInt();
		switch(date)
		{
			case 18:
			System.out.println("happy narak chaturdashi");
			break;
			case 19:
			System.out.println("happy diwali");
			break;
			case 20:
			System.out.println("happy gowardhan puja");
			break;
			case 21:
			System.out.println("happy bahiya dooj");
			break;
			case 26:
			System.out.println("happy chhat puja");
			break;
			default:
			System.out.println("there is no big festival today...Enjoy yourself");
			break;
			
		}
	}
}
		
		
		
		
		
		
		