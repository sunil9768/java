import java.util.Scanner;
class kodechasingh
{ 
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int date=1;
		System.out.println("enter a date of october month from 18 to 26");
		date=sc.nextInt();
		if(date>31 || date<1)
			System.out.print("Oops...enter a valid date");
		switch(date)
		{   case 18: System.out.println("happy ::narak chaturdashi::");
			break;
			case 19: System.out.println("happy ::diwali::");
			break;
			case 20: System.out.println("happy ::gowardhan puja::");
			break;
			case 21: System.out.println("happy ::bahiya dooj::");
			break;
			case 22: System.out.println("there is no big festival today....Enjoy yourself");
			break;
			case 23: System.out.println("there is no big festival today....Enjoy yourself");
			break;
			case 24: System.out.println("there is no big festival today....Enjoy yourself");
			break;
			case 25: System.out.println("there is no big festival today....Enjoy yourself");
			break;
			case 26: System.out.println("happy ::chhat puja::");
			break; 
		}  
	} 		
}