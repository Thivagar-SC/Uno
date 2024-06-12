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

    private final int numberCards = 80;  //76 cards including number 0 to 9
    private final int plusTwoCards = 8;  //2 each of +2 cards
    private final int reverseCards = 8;  //2 each of reverse cards
    private final int blockCards = 8;     //2 each of block cards
    private final int wildCards = 4;     //2 wild cards
    private final int plusFourCards = 4; //4 +4 cards

    private final int colorRed = 0;
    private final int colorBlue = 1;
    private final int colorYellow = 2;
    private final int colorGreen = 3;
    private final int colorBlack = 4;

    private boolean selectable = true;     //Sets selectable to not equal itself

    /** Default constructor */
    public Deck()
    {
        super();
        deck = new ArrayList<>();
        this.fillDeck();
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
        removeCard();
        return drawnCard;
    }

    /** Refills deck with cards if all cards are drawn or a new game started */
    public void fillDeck()
    {
        deck.clear();
        addNumberCards();
        addSpecialCards();
        Collections.shuffle(deck);
    }

    /** Removes the first card from the deck */
    public void removeCard()
    {
        deck.remove(0);
    }

    public void addSpecialCards()
    {
        addPlusTwoCards();
        addPlusFourCards();
        addReverseCards();
        addBlockCards();
        addWildCards();
    }

    public void addPlusFourCards()
    {
        for (int i = 0; i < 4; i++)
        {
            deck.add(new Card(13, colorBlack));
        }
    }

    public void addWildCards()
    {
        for (int i = 0; i < 4; i++)
        {
            deck.add(new Card(14, colorBlack));
        }
    }

    public void addBlockCards()
    {
        for (int i = 0; i < 4; i++)
        {
            deck.add(new Card(12, i));
            deck.add(new Card(12, i));
        }
    }

    public void addReverseCards()
    {
        for (int i = 0; i < 4; i++)
        {
            deck.add(new Card(10, i));
            deck.add(new Card(10, i));
        }
    }

    public void addPlusTwoCards()
    {
        for (int i = 0; i < 4; i++)
        {
            deck.add(new Card(11, i));
            deck.add(new Card(11, i));
        }
    }

    /** Method to add 76 number cards from 4 different colours to the deck */
    public void addNumberCards() {
        for (int cardFaceValue = 0; cardFaceValue < numberCards/8; cardFaceValue++)
        {
            for (int colour = 0; colour < 4; colour++)
            {
                deck.add(new Card(cardFaceValue, colour));
                deck.add(new Card(cardFaceValue, colour));
            }
        }
    }

    /** Sets whether the deck is selectable.
     *  @param selectable
     */
    public void setSelectable(boolean selectable)
    {

    }
}
