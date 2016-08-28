import java.util.Scanner;
import java.util.Random; 

class deal
{

	
	//public int first_card;
	//public int second_card;
	public int first_deal_p;

	public int first_card_dealer;
	public int second_card_dealer; //face down card
	public int first_deal_dealer;
	



public  void first_deal ()
	{

Random rand=new Random ();

   int first_card= 1+rand.nextInt(11);
   int second_card= 1+rand.nextInt(11);
    first_deal_p= first_card+second_card;
   


	first_card_dealer=1+rand.nextInt(11);
 	second_card_dealer=1+rand.nextInt(11); //face down card
 	first_deal_dealer=first_card_dealer+second_card_dealer;
}

public void show()
{ 

System.out.println("The dealer has: " + first_card_dealer + " X(Hole number)");

System.out.println("You have: " + first_deal_p);
System.out.println();

}




public  void stay ()
{


	Random rand=new Random ();


	System.out.println("You have decided to stay on: " + first_deal_p);

	System.out.println("The dealer turns his hole card: " + second_card_dealer + " And has a current total of: " + first_deal_dealer);

	int hit_dealer=1+rand.nextInt(11);
	int hit_dealer_total=hit_dealer+first_deal_dealer;

	if(first_deal_p<first_deal_dealer && first_deal_dealer<=21)
	{

		System.out.println("Dealer wins! Dealer has: " + first_deal_dealer + " While you have: " + first_deal_p);
	}
	else if (first_deal_dealer<21)
	{
		System.out.println("The dealer will now hit" );
		System.out.println("The dealer after hitting has: " + hit_dealer_total);
		
		if(hit_dealer_total>21)
		{

			System.out.println("Dealer has busted");
		}
		else if (hit_dealer_total<=21 && hit_dealer_total>first_deal_p)
		{
			System.out.println("The dealer has won, as he has: " + hit_dealer_total + " And you have: " + first_deal_p);
		}

		//System.out.println("You Win! As dealer has busted on" + first_deal_dealer);
	}
}

public void hit ()
{

	
	Scanner scan=new Scanner(System.in);
	Random rand=new Random ();


	System.out.println("You have decided to hit on: " + first_deal_p);

	int hit_p = 1+rand.nextInt(11);
	int hit_to_first_deal_p =  first_deal_p + hit_p;

	int hit_p2 = 1+rand.nextInt(11);
	int second_hit_p = hit_to_first_deal_p + hit_p2;


	if (hit_to_first_deal_p < 21)
	{

		System.out.println("You have:" + hit_to_first_deal_p);
		if(hit_to_first_deal_p<21)
			{
				System.out.print("You want to hit again on your " + hit_to_first_deal_p + " ? yes/no "); //left out the ln to c if scanner nextLien will work
				String hit_again_ans = scan.nextLine();

				if(hit_again_ans.equals("yes"))
					{
						System.out.println("Your second hit is a " + hit_p2 + ". So you are now on "+ second_hit_p );
					}
				else //if (hit_again_ans.equals("no"))
					{
						System.out.println("You are staying put on " + hit_to_first_deal_p );
					}

			}
	}
	else if (hit_to_first_deal_p == 21)
	{

		System.out.println("You have WON as you have got a " + hit_p + ". Which gives you blackjack (21)"); //add here what he has won
	}
	else if (hit_to_first_deal_p>21)
	{

		System.out.println("Bust! You lose as you have: " + hit_to_first_deal_p);
	}
}

}