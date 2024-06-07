import javax.swing.*;
import java.awt.*;

public class ImgComponent extends JComponent{
    ImageIcon image;

    public ImgComponent(String imageFile){
        super();
        this.image = new ImageIcon(imageFile);
        this.setPreferredSize(new Dimension(200,300));
    }

    public ImgComponent(){
        super();
        this.image = new ImageIcon(this.getImgFile(null));
        this.setPreferredSize(new Dimension(200,200));
    }

    public String getImgFile(JPanel fileholder){
        JFileChooser chooser = new JFileChooser();
        int fileSuccess = chooser.showOpenDialog(fileholder);
        String fileName="";
        if (fileSuccess==JFileChooser.APPROVE_OPTION){
            fileName = chooser.getSelectedFile().getName();
        }

        return fileName;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Image pic = image.getImage();
        g.drawImage(pic, 0, 0,200,300, null);
    }
}
