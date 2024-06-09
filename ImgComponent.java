import javax.swing.*;
import java.awt.*;
import java.io.*;;

public class ImgComponent extends JComponent{
    ImageIcon image;
    File holder;
    JFileChooser a;

    public ImgComponent(String imageFile){
        super();
        holder = new File(getClass().getResource("ImgHolder").getFile());
        File[] test2 = holder.listFiles();
        this.image = new ImageIcon(test2[0].getAbsolutePath());
        this.setPreferredSize(new Dimension(200,300));
        //a = new JFileChooser("ImgHolder");
        //System.out.println(image.getImage().);

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
