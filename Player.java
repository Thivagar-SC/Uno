import java.util.ArrayList;
import java.util.*;

public class Player {
    private String playerName; // name of the player
    private boolean wonRound; // if player won or not
    private int totalScore; // score of player
    private int playerNumber; // value of player (determines order)
    private ArrayList<Card> cards; //List of cards player has
    private String source;//Reason for drawing cards
    private boolean selectable; 


    public Player(int playerNumber, String playerName) {
        this.playerNumber = playerNumber;
        this.playerName = playerName;
        this.wonRound = false;
        this.totalScore = 0;
        this.selectable = false;

    }

    public void addCard(Card card, String source) {

        cards.add(card);
        this.source = source;
    }
        

    public void placeCard(int cardIndex) {
        cards.remove(cardIndex);
    }

    public void setSelectable() {
        this.selectable = !this.selectable;
    }

    public boolean setGetSelectable() {
        return setGetSelectable();
    }

    public ArrayList<Card> getHand() {
        return cards;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setWon() {
        this.wonRound = true;
    }

    public int getTotalScore() {
        return totalScore;
    }
    public int GetPlayerID()
    {
        return playerNumber;
    }    

    public void organizeHand() {
        sortByColour();
        sortByNumbWithColour();
    }

    private void sortByColour() {
        int minIndex;
        for (int x = 0; x < cards.size(); x++) {
            minIndex = x;
            for (int y = x + 1; y < cards.size(); y++) {
                if (cards.get(y).getColour() < cards.get(minIndex).getColour()) {
                    minIndex = y;
                }
            }
            Card temp = cards.get(minIndex);
            cards.set(minIndex, cards.get(x));
            cards.set(x, temp);
        }
    }

    private void sortByNumbWithColour() {
        int minIndex;
        for (int x = 0; x < cards.size(); x++) {
            int color = cards.get(x).getColour();
            int endIndex = x;
            while (endIndex < cards.size() && cards.get(endIndex).getColour() == color) {
                endIndex++;
            }

            for (int a = x; a < cards.size(); a++) {
                minIndex = a;
                for (int y = a + 1; y < cards.size(); y++) {
                    if (cards.get(y).getValue() < cards.get(minIndex).getValue()) {
                        minIndex = y;
                    }
                }
                Card temp = cards.get(minIndex);
                cards.set(minIndex, cards.get(a));
                cards.set(a, temp);
            }
            x = endIndex - 1;
        }
    }
}