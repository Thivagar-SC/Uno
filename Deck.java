import java.util.*;
import java.util.List;

/** Deck class represents a deck of playing cards.
 *  @author Tanner
 *  @since 06/07/2024
 */
public class Deck
{
    //Variable declarations
    private List<Card> deck;        //List of cards in the deck
    private boolean selectable = true;     //Sets selectable to not equal itself

    /** Default constructor */
    public Deck()
    {
        super();
        deck = new ArrayList<>();
    }

    /**
     * Draws the first card in the deck.
     * If the deck is empty, calls fillDeck() to refill the deck.
     *
     * @return The card drawn from the deck.
     */
    public Card drawCard()
    {
        if (deck.isEmpty())
        {
            fillDeck();
        }
        Card drawnCard = deck.get(0);
        deck.remove(0);
        return drawnCard;
    }

    /** Refills deck with cards if all cards are drawn or a new game started */
    public void fillDeck()
    {
        deck.clear();
        for (int color = 0; color < 4; color++)
        {
            deck.add(new Card(0, color));

            for (int faceValue = 1; faceValue <= 13; faceValue++)
            {
                deck.add(new Card(faceValue, color));
                deck.add(new Card(faceValue, color));
            }
        for (int i = 0; i < 4; i++)
        {
            deck.add(new Card(13, i));
            deck.add(new Card(14, i));
        }
        }
        Collections.shuffle(deck);
    }

    /** Removes the first card from the deck */
    public void removeCard() {
        deck.remove(0);
    }

    /** Sets whether the deck is selectable.
     *  @param selectable
     */
    public void setSelectable(boolean selectable)
    {

    }
}
