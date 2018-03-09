/**
 * ---------------------------------------------------------------------------

 * File name: Deck.java
 * Project name: Cards
 * ---------------------------------------------------------------------------
 * Creator's name and email: Michael Erwin, erwinmj@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Feb 14, 2018
 * ---------------------------------------------------------------------------
 */

package cards;
import java.util.Random;

/**
 * use the card class to create a deck of cards
 *
 * <hr>
 * Date created: Feb 14, 2018
 * <hr>
 * @author Michael Erwin
 */
public class Deck
{
	private int nextCard; //this decides which card to take from the deck when a card is dealt
	private Card[] deck;  //this array holds the deck of cards
	
	/**
	 * Default Constructor        
	 *
	 * <hr>
	 * Date created: Feb 14, 2018 
	 *
	 * 
	 */
	public Deck()
	{
		deck = new Card[52];
		nextCard = 0;
		for(int i = 0; i < 52; i++)
		{
			deck[i] = new Card(i);
		}
	}
	
	/**
	 * Copy Constructor        
	 *
	 * <hr>
	 * Date created: Feb 14, 2018 
	 */
	public Deck(Deck existingDeck)
	{
		for(int i = 0; i < 52; i++)
		{
			this.deck[i] = existingDeck.deck[i];
			this.nextCard = existingDeck.nextCard;
		}
	}
	/**
	 * Display the cards in the deck  
	 *
	 * <hr>
	 * Date created: Feb 14, 2018 
	 *
	 * <hr>
	 * @return String of info of cards in the deck
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		String info = "";
		for(int i = 0; i < 52; i++)
		{
			info += (deck[i].toString()) + "\n" ;
		}
		return info;  
	}
	
	/**
	 * Shuffle the cards in the deck 
	 *
	 * <hr>
	 * Date created: Feb 14, 2018 
	 *
	 * <hr>
	 * @return void
	 */
	public void shuffle()
	{
		nextCard = 0;
		Random randomNum = new Random();
		int ranNum = 0; 
		Card tempCard = null;
		for(int i = 0; i < 52; i++)
		{
			ranNum = randomNum.nextInt (52);
			tempCard = new Card(deck[i]);
			deck[i] = deck[ranNum];
			deck[ranNum] = tempCard;  
		}
	}
	
	/**
	 * Deal a card based on the nextCard counter
	 *
	 * <hr>
	 * Date created: Feb 14, 2018 
	 *
	 * <hr>
	 * @return Card object
	 */
	public Card dealACard()
	{
		Card returnCard = deck[nextCard++];
		return returnCard;  
	} 
	
	/**
	 * use the dealACard() method to create a hand based on the handSize variable  
	 *
	 * <hr>
	 * Date created: Feb 14, 2018 
	 *
	 * <hr>
	 * @return Hand object
	 */
	public Hand dealAHand(int handSize)
	{
		Hand handObj = new Hand(handSize);
		
		//this deals cards into the hand
		for(int i = 0; i < handSize; i++)
		{
		handObj.addCard(dealACard());  
		}
		
		return handObj; 
		} 
}

