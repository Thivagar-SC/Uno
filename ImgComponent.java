import javax.swing.*;
import java.awt.*;
import java.io.*;;

public class ImgComponent extends JComponent{
    ImageIcon image;

    public ImgComponent(String imageFile){
        super();
        this.image = new ImageIcon(imageFile);
        this.setPreferredSize(new Dimension(200,300));

        File test = new File(imageFile);
        if (!test.exists()){
            System.err.println("ERROR FINDING IMAGE"); //temporary result
        }
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Image pic = image.getImage();
        g.drawImage(pic, 0, 0,200,300, null);
    }
}
