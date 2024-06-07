import java.awt.*;
import java.util.*;
import java.util.List;
public class Deck
{
    private List<Card> deck;
    private boolean selectable;

    public Deck()
    {
        super();
        deck = new ArrayList<>();
    }

    /**
     * Draws the first card in the deck
     * If deck is empty, call fillDeck() to refill the deck.
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

    public void removeCard()
    {

    }

    public void setSelectable(boolean selectable)
    {

    }

    public void fillDeck()
    {

    }

    public void shuffle()
    {

    }

    public void getTopCard()
    {
        
    }
}
