import javax.swing.*;
import java.awt.*;
import java.io.*;

public class ImgComponent extends JComponent{
    ImageIcon image;
    File holder;
    JFileChooser a;
    File[] test2;

    public ImgComponent(String imageFile){
        super();

        this.image = new ImageIcon(imageFile);
        this.setPreferredSize(new Dimension(200,300));
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(this.image.getImage(),0, 0,200,300, null);
    }
}
