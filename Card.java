public class Card
{
    private final int cardFaceValue;  //value of card
    private final int colour; //color of card

    public Card(int cardFaceValue, int colour)
    {
        super();
        this.cardFaceValue = cardFaceValue;
        this.colour = colour;
    }

    public int getValue()
    {
        return cardFaceValue;
    }

    public int getColour()
    {
        return colour;
    }

}
