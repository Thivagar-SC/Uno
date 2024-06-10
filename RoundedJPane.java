import java.awt.*;
import javax.swing.*;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;

public class RoundedJPane extends JLayeredPane
{
    private int radius;
    private int h = 336;
    private int w = 211;
    
    public RoundedJPane(int radius){
        this.radius = radius;
        this.setPreferredSize(new Dimension(w,h));
    }

    public void paintComponent(Graphics g){
        g.setColor(Color.BLUE);
        g.fillRoundRect(0, 0, 200, 300, 50, 50);
        super.paintComponent(g);

    }
}
