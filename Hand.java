/**
 * ---------------------------------------------------------------------------
 * File name: Hand.java
 * Project name: Cards
 * ---------------------------------------------------------------------------
 * Creator's name and email: Michael Erwin, erwinmj@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Feb 21, 2018
 * ---------------------------------------------------------------------------
 */

package cards;
import java.util.ArrayList;

/**
 * Contains information regarding a hand of cards
 *
 * <hr>
 * Date created: Feb 21, 2018
 * <hr>
 * @author Michael Erwin
 */
public class Hand
{

	
	private int handSize;         //this decides the size of the hand
	private int cardsInHand;      //this tells how many cards have actually been added to the hand
	private ArrayList<Card> hand; //this ArrayList stores the Cards in the hand
	
	/**
	 * Default Constructor        
	 *
	 * <hr>
	 * Date created: Feb 21, 2018 
	 */
	public Hand()
	{
		handSize = 5;
		cardsInHand = 0;
		hand = new ArrayList<Card>(handSize);
	}

	
	/**
	 * Parameterized Constructor        
	 *
	 * <hr>
	 * Date created: Feb 21, 2018 
	 *
	 * 
	 * @param handSize
	 */
	public Hand (int handSize)
	{
		this.handSize = handSize;
		this.cardsInHand = 0;
		hand = new ArrayList<Card>(handSize); 
	}


	
	/**
	 * Copy Constructor        
	 *
	 * <hr>
	 * Date created: Feb 21, 2018 
	 */
	public Hand(Hand handIn)
	{
		this.handSize = handIn.handSize;
		this.cardsInHand = handIn.cardsInHand;
		
		for(int i = 0;i < hand.size(); i++)
		{
			this.hand.set(i, handIn.hand.get(i));
		}
	}
	
	/**
	 * This uses the hand.add() method to add Card objects to the ArrayList     
	 *
	 * <hr>
	 * Date created: Feb 21, 2018 
	 *
	 * <hr>
	 * @return void
	 */
	public void addCard(Card card)
	{
		if(hand.size() < 52 && cardsInHand < 52)
		{ 
		hand.add(card);
		cardsInHand++;
		}
		else System.out.println ("No more cards allowed"); 
	}
	
	/**
	 * Describe the hand       
	 *
	 * <hr>
	 * Date created: Feb 21, 2018 
	 *
	 * <hr>
	 * @return
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		
		for(int i = 0; i < hand.size(); i++)
		{
			System.out.println(hand.get(i));
		}
		return "";  
	}
	
	
	
}
