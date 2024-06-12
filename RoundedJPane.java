import java.awt.*;
import javax.swing.*;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;

public class RoundedJPane extends JLayeredPane {
    private int radius;

    private final int RED = 0;
    private final int BLUE = 1;
    private final int YELLOW = 2;
    private final int GREEN = 3;
    private final int BLACK = 4;

    private int currentColour;
    private int h = 336;
    private int w = 211;

    public RoundedJPane(int radius, int colour) {
        this.radius = radius;
        this.currentColour = colour;
        this.setPreferredSize(new Dimension(w, h));
    }

    public void paintComponent(Graphics g) {
        setColor(this.currentColour, g);
        g.fillRoundRect(0, 0, 195, 295, this.radius, this.radius);
        super.paintComponent(g);

    }

    public void setColor(int color, Graphics g) {
        switch (color) {
            case RED:
                g.setColor(Color.RED);
                break;

            case BLUE:
                g.setColor(Color.BLUE);
                break;

            case YELLOW:
                g.setColor(Color.YELLOW);
                break;

            case GREEN:
                g.setColor(Color.GREEN);
                break;

            case BLACK:
                g.setColor(Color.BLACK);
                break;
        }
    }
}
