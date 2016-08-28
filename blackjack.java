import java.util.Scanner;

class blackjack
{

	public static void main (String [] args)
	{


System.out.println("==========================LEVON'S BLACKJACK GAME============================");
System.out.println();


Scanner scan = new Scanner(System.in);

System.out.print("Please enter a wager from $1 - 100:   $");

int wage=scan.nextInt();

//deal object_deal=new deal();
//object_deal.first_deal();
//object_deal.show();


option(wage);

	}


	public static void option(int wage)
	{

		int cash=wage; //can just leave as wage and will still work in the system.out.println(wage);

		Scanner scan = new Scanner(System.in);

		deal object_deal=new deal();
		object_deal.first_deal();
		object_deal.show();


		System.out.println("Would you like to stay or hit?" + " Remember you have wagerd: $" + cash );
		
		String decision=scan.nextLine();

		

		if(decision.equals("Stay") || decision.equals("stay"))
		
		{
			
			object_deal.stay();
		} 
		if(decision.equals("Hit") || decision.equals("hit"))
		
		{
		
			object_deal.hit();
		}

	}





}
