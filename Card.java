public class Card
{
    private static int cardFaceValue;  //value of card
    private int colour; //color of card

    public Card(int cardFaceValue, int colour)
    {
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
