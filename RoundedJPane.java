import java.awt.*;
import javax.swing.*;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;

public class RoundedJPane extends JLayeredPane
{
    private int radius;
    
    public RoundedJPane(int radius){
        this.radius = radius;
        this.setPreferredSize(new Dimension(200,300));
    }

    public void paintComponent(Graphics2D g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLUE);
        Area a = new Area(new RoundRectangle2D.Double(0,0,200,300,50,50));
        g.drawRoundRect(0, 0, 200, 300, 50, 50);
        g2.fill(a);
        //g2.setBackground(Color.blue);
        super.paintComponent(g);

    }
}
