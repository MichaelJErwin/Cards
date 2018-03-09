/**
 * ---------------------------------------------------------------------------
 * File name: Card.java
 * Project name: Cards
 * ---------------------------------------------------------------------------
 * Creator's name and email: Michael Erwin, erwinmj@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Feb 7, 2018
 * ---------------------------------------------------------------------------
 */

package cards;


/**
 * Contain information for a card
 *
 * <hr>
 * Date created: Feb 7, 2018
 * <hr>
 * @author Michael Erwin
 */
public class Card
{

	private Face faceType; //reference variable for type Face
	private Suit suitType; //reference variable for type Suit
	
	
	/**
	 * Default Constructor        
	 *
	 * <hr>
	 * Date created: Feb 7, 2018 
	 */
	public Card()
	{
		this.faceType = Face.two; 
		this.suitType = Suit.hearts; 
	}
	/**
	 * Copy an object Constructor        
	 *
	 * <hr>
	 * Date created: Feb 7, 2018  
	 */
	public Card(Card existingCard) 
	{ 
		this.faceType = existingCard.faceType;
		this.suitType = existingCard.suitType;
	}
	/**
	 * Constructor with an int parameter       
	 *
	 * <hr>
	 * Date created: Feb 7, 2018 
	 *
	 * 
	 */
	public Card(int n) 
	{
		faceType = Face.values()[n%13];
		suitType = Suit.values()[n%4];
	}
	
	/**
	 * return a string for the card info       
	 *
	 * <hr>
	 * Date created: Feb 7, 2018 
	 *
	 * <hr>
	 * @return
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		String info = "the " + this.faceType + " of " + this.suitType; //string to hold into for the toString method
		return info; 
	}
}
