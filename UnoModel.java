import java.util.List;
import java.io.*;

public class UnoModel
{
    private UnoView view;
    private Card currentlyPlacedCard;
    private String gameState;
    private int turn;
    private Player player;
    private UnoAi ai;
    private Deck deck;
    private boolean safe;
    private int numberOfRounds;
    private List<int> points;
    private List<String> winners;
    private BufferedReader input;
    private PrintWriter output;

    public void nextTurn(boolean direction, int skip)
    {

    }

    public void checkIfRoundIsOver()
    {

    }

    public void placeCard(int cardIndex, int playerID)
    {

    }

    public Player getCurrentPlayer()
    {
        return player;
    }

    public void setPauseState (boolean isPaused)
    {

    }

    public void quitGame()
    {
        System.exit(0);
    }

    public void inputForESC  (int keyCode)
    {

    }

    public void changeColour(int colour)
    {

    }

    public int getColour()
    {
        return 0; //placeholder
    }

    public void setUNOState()
    {

    }

    public boolean isSafe()
    {
        return true; //placeholder
    }

    public void startGame()
    {

    }

    public void nextRound()
    {

    }

    public void endGame()
    {

    }

    public boolean isLegal(Card card)
    {
        return true; //placeholder
    }
}
