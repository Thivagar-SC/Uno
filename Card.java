
/**
 * Card
 * Creates a playing card that has a value and colour
 * 
 * @author tba
 * @since 2024/06/12
 */
public class Card {
    private final int cardFaceValue; // value of card
    private int colour; // color of card

    /**
     * Card
     * Card Constructor
     * 
     * @author tba
     * @param cardFaceValue - set value of card
     * @param colour        - colour card will be
     */
    public Card(int cardFaceValue, int colour) {
        super();
        this.cardFaceValue = cardFaceValue;
        this.colour = colour;
    }

    /**
     * getValue
     * returns value of card
     * 
     * @return cardFaceValue
     * @author tba
     */
    public int getValue() {
        return cardFaceValue;
    }

    /**
     * getColour
     * returns the colour of a card
     * 
     * @author tba
     * @return colour
     */
    public int getColour() {
        return colour;
    }

    /**
     * changeColour
     * changes the colour of a card
     * 
     * @author tba
     * @param newColour - colour card will change to
     */
    public void changeColour(int newColour) {
        colour = newColour;
    }

}
