/**
 * ---------------------------------------------------------------------------
 * File name: Driver.java
 * Project name: Cards
 * ---------------------------------------------------------------------------
 * Creator's name and email: Michael Erwin, erwinmj@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Feb 14, 2018
 * ---------------------------------------------------------------------------
 */

package cards;
import java.util.Scanner;

/**
 * Driver class for the other classes
 *
 * <hr>
 * Date created: Feb 14, 2018
 * <hr>
 * @author Michael Erwin
 */
public class Driver
{

	/**
	 * Create a deck of card object, handle I/O
	 *
	 * <hr>
	 * Date created: Feb 14, 2018
	 *
	 * <hr>
	 * @param args
	 */
	public static void main (String[] args)
	{
		Scanner kb = new Scanner(System.in); //create a Scanner object
		
		int handSize   = 0;  //size of hand for each player
		int numPlayers = 0;  //number of players to be dealt a hand
		
		//this makes sure a valid combination of cards per hand and number of players has been entered based on a 52 card deck
		do
		{
			
			System.out.println ("How many cards per hand?"); 
			while(!kb.hasNextInt()) 
			{
				System.out.println ("How many cards per hand?"); 
				kb.next();
			}
			handSize = kb.nextInt();
			
			System.out.println ("How many players?");
			while(!kb.hasNextInt()) 
			{
				System.out.println ("How many players?"); 
				kb.next();
			}
			numPlayers = kb.nextInt();
			if(handSize * numPlayers > 52) System.out.println("Not enought cards");
			
		}while((handSize * numPlayers) >52 || (handSize * numPlayers) <=0);
		
		
		Deck myDeck = new Deck();  //create the Deck object
		myDeck.shuffle();
		myDeck.shuffle(); //shuffle the Deck object twice
		
		//this deals a hand for each player
		for(int i = 0; i < numPlayers; i++)
		{
			System.out.println ("Player " + (i + 1) + ": "); 
			System.out.println(myDeck.dealAHand(handSize)); 
		}
		kb.close(); //close the Scanner object
	}

}
