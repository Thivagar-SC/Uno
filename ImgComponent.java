import javax.swing.*;
import java.awt.*;
import java.io.*;

public class ImgComponent extends JComponent{
    ImageIcon image;
    File holder;
    JFileChooser a;

    public ImgComponent(String imageFile){
        super();
        holder = new File(getClass().getResource("ImgHolder").getFile());
        File[] test2 = holder.listFiles();
        System.out.println(holder);
        for (int x = 0; x<holder.length();x++){
            System.out.println(test2[x]);
        }
        try {
            this.image = new ImageIcon(test2[1].getCanonicalPath());
        } catch (Exception e) {
            // TODO: handle exception
        }
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
